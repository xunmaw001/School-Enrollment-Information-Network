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

import com.entity.ShiziduiwuEntity;
import com.entity.view.ShiziduiwuView;

import com.service.ShiziduiwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 师资队伍
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
@RestController
@RequestMapping("/shiziduiwu")
public class ShiziduiwuController {
    @Autowired
    private ShiziduiwuService shiziduiwuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiziduiwuEntity shiziduiwu, HttpServletRequest request){

        EntityWrapper<ShiziduiwuEntity> ew = new EntityWrapper<ShiziduiwuEntity>();
    	PageUtils page = shiziduiwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiziduiwu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiziduiwuEntity shiziduiwu, HttpServletRequest request){
        EntityWrapper<ShiziduiwuEntity> ew = new EntityWrapper<ShiziduiwuEntity>();
    	PageUtils page = shiziduiwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiziduiwu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiziduiwuEntity shiziduiwu){
       	EntityWrapper<ShiziduiwuEntity> ew = new EntityWrapper<ShiziduiwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiziduiwu, "shiziduiwu")); 
        return R.ok().put("data", shiziduiwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiziduiwuEntity shiziduiwu){
        EntityWrapper< ShiziduiwuEntity> ew = new EntityWrapper< ShiziduiwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiziduiwu, "shiziduiwu")); 
		ShiziduiwuView shiziduiwuView =  shiziduiwuService.selectView(ew);
		return R.ok("查询师资队伍成功").put("data", shiziduiwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiziduiwuEntity shiziduiwu = shiziduiwuService.selectById(id);
        return R.ok().put("data", shiziduiwu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiziduiwuEntity shiziduiwu = shiziduiwuService.selectById(id);
        return R.ok().put("data", shiziduiwu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiziduiwuEntity shiziduiwu, HttpServletRequest request){
    	shiziduiwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiziduiwu);

        shiziduiwuService.insert(shiziduiwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShiziduiwuEntity shiziduiwu, HttpServletRequest request){
    	shiziduiwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiziduiwu);

        shiziduiwuService.insert(shiziduiwu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShiziduiwuEntity shiziduiwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiziduiwu);
        shiziduiwuService.updateById(shiziduiwu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiziduiwuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShiziduiwuEntity> wrapper = new EntityWrapper<ShiziduiwuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shiziduiwuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
