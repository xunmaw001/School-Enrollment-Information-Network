package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XiaoyuanzhijiaEntity;
import com.entity.view.XiaoyuanzhijiaView;

import com.service.XiaoyuanzhijiaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 校园之家
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
@RestController
@RequestMapping("/xiaoyuanzhijia")
public class XiaoyuanzhijiaController {
    @Autowired
    private XiaoyuanzhijiaService xiaoyuanzhijiaService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiaoyuanzhijiaEntity xiaoyuanzhijia, HttpServletRequest request){

        EntityWrapper<XiaoyuanzhijiaEntity> ew = new EntityWrapper<XiaoyuanzhijiaEntity>();
    	PageUtils page = xiaoyuanzhijiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaoyuanzhijia), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiaoyuanzhijiaEntity xiaoyuanzhijia, HttpServletRequest request){
        EntityWrapper<XiaoyuanzhijiaEntity> ew = new EntityWrapper<XiaoyuanzhijiaEntity>();
    	PageUtils page = xiaoyuanzhijiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaoyuanzhijia), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiaoyuanzhijiaEntity xiaoyuanzhijia){
       	EntityWrapper<XiaoyuanzhijiaEntity> ew = new EntityWrapper<XiaoyuanzhijiaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiaoyuanzhijia, "xiaoyuanzhijia")); 
        return R.ok().put("data", xiaoyuanzhijiaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiaoyuanzhijiaEntity xiaoyuanzhijia){
        EntityWrapper< XiaoyuanzhijiaEntity> ew = new EntityWrapper< XiaoyuanzhijiaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiaoyuanzhijia, "xiaoyuanzhijia")); 
		XiaoyuanzhijiaView xiaoyuanzhijiaView =  xiaoyuanzhijiaService.selectView(ew);
		return R.ok("查询校园之家成功").put("data", xiaoyuanzhijiaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiaoyuanzhijiaEntity xiaoyuanzhijia = xiaoyuanzhijiaService.selectById(id);
        return R.ok().put("data", xiaoyuanzhijia);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiaoyuanzhijiaEntity xiaoyuanzhijia = xiaoyuanzhijiaService.selectById(id);
        return R.ok().put("data", xiaoyuanzhijia);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiaoyuanzhijiaEntity xiaoyuanzhijia, HttpServletRequest request){
    	xiaoyuanzhijia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaoyuanzhijia);

        xiaoyuanzhijiaService.insert(xiaoyuanzhijia);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiaoyuanzhijiaEntity xiaoyuanzhijia, HttpServletRequest request){
    	xiaoyuanzhijia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaoyuanzhijia);

        xiaoyuanzhijiaService.insert(xiaoyuanzhijia);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XiaoyuanzhijiaEntity xiaoyuanzhijia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiaoyuanzhijia);
        xiaoyuanzhijiaService.updateById(xiaoyuanzhijia);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiaoyuanzhijiaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XiaoyuanzhijiaEntity> wrapper = new EntityWrapper<XiaoyuanzhijiaEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = xiaoyuanzhijiaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
