package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShiziduiwuDao;
import com.entity.ShiziduiwuEntity;
import com.service.ShiziduiwuService;
import com.entity.vo.ShiziduiwuVO;
import com.entity.view.ShiziduiwuView;

@Service("shiziduiwuService")
public class ShiziduiwuServiceImpl extends ServiceImpl<ShiziduiwuDao, ShiziduiwuEntity> implements ShiziduiwuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiziduiwuEntity> page = this.selectPage(
                new Query<ShiziduiwuEntity>(params).getPage(),
                new EntityWrapper<ShiziduiwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiziduiwuEntity> wrapper) {
		  Page<ShiziduiwuView> page =new Query<ShiziduiwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiziduiwuVO> selectListVO(Wrapper<ShiziduiwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiziduiwuVO selectVO(Wrapper<ShiziduiwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiziduiwuView> selectListView(Wrapper<ShiziduiwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiziduiwuView selectView(Wrapper<ShiziduiwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
