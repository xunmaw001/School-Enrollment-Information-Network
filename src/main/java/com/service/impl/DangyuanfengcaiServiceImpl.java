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


import com.dao.DangyuanfengcaiDao;
import com.entity.DangyuanfengcaiEntity;
import com.service.DangyuanfengcaiService;
import com.entity.vo.DangyuanfengcaiVO;
import com.entity.view.DangyuanfengcaiView;

@Service("dangyuanfengcaiService")
public class DangyuanfengcaiServiceImpl extends ServiceImpl<DangyuanfengcaiDao, DangyuanfengcaiEntity> implements DangyuanfengcaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangyuanfengcaiEntity> page = this.selectPage(
                new Query<DangyuanfengcaiEntity>(params).getPage(),
                new EntityWrapper<DangyuanfengcaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangyuanfengcaiEntity> wrapper) {
		  Page<DangyuanfengcaiView> page =new Query<DangyuanfengcaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangyuanfengcaiVO> selectListVO(Wrapper<DangyuanfengcaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangyuanfengcaiVO selectVO(Wrapper<DangyuanfengcaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangyuanfengcaiView> selectListView(Wrapper<DangyuanfengcaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangyuanfengcaiView selectView(Wrapper<DangyuanfengcaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
