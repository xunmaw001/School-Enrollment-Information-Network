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

import com.entity.XueshengluquEntity;
import com.entity.view.XueshengluquView;

import com.service.XueshengluquService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 学生录取
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
@RestController
@RequestMapping("/xueshengluqu")
public class XueshengluquController {
    @Autowired
    private XueshengluquService xueshengluquService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshengluquEntity xueshengluqu, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xueshengluqu.setXueshenghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshengluquEntity> ew = new EntityWrapper<XueshengluquEntity>();
    	PageUtils page = xueshengluquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengluqu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengluquEntity xueshengluqu, HttpServletRequest request){
        EntityWrapper<XueshengluquEntity> ew = new EntityWrapper<XueshengluquEntity>();
    	PageUtils page = xueshengluquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengluqu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengluquEntity xueshengluqu){
       	EntityWrapper<XueshengluquEntity> ew = new EntityWrapper<XueshengluquEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengluqu, "xueshengluqu")); 
        return R.ok().put("data", xueshengluquService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengluquEntity xueshengluqu){
        EntityWrapper< XueshengluquEntity> ew = new EntityWrapper< XueshengluquEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengluqu, "xueshengluqu")); 
		XueshengluquView xueshengluquView =  xueshengluquService.selectView(ew);
		return R.ok("查询学生录取成功").put("data", xueshengluquView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengluquEntity xueshengluqu = xueshengluquService.selectById(id);
        return R.ok().put("data", xueshengluqu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengluquEntity xueshengluqu = xueshengluquService.selectById(id);
        return R.ok().put("data", xueshengluqu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengluquEntity xueshengluqu, HttpServletRequest request){
    	xueshengluqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengluqu);

        xueshengluquService.insert(xueshengluqu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengluquEntity xueshengluqu, HttpServletRequest request){
    	xueshengluqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengluqu);

        xueshengluquService.insert(xueshengluqu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XueshengluquEntity xueshengluqu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengluqu);
        xueshengluquService.updateById(xueshengluqu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengluquService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XueshengluquEntity> wrapper = new EntityWrapper<XueshengluquEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xueshenghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xueshengluquService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
