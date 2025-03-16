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


import com.dao.XiaoyuanzhijiaDao;
import com.entity.XiaoyuanzhijiaEntity;
import com.service.XiaoyuanzhijiaService;
import com.entity.vo.XiaoyuanzhijiaVO;
import com.entity.view.XiaoyuanzhijiaView;

@Service("xiaoyuanzhijiaService")
public class XiaoyuanzhijiaServiceImpl extends ServiceImpl<XiaoyuanzhijiaDao, XiaoyuanzhijiaEntity> implements XiaoyuanzhijiaService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuanzhijiaEntity> page = this.selectPage(
                new Query<XiaoyuanzhijiaEntity>(params).getPage(),
                new EntityWrapper<XiaoyuanzhijiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuanzhijiaEntity> wrapper) {
		  Page<XiaoyuanzhijiaView> page =new Query<XiaoyuanzhijiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuanzhijiaVO> selectListVO(Wrapper<XiaoyuanzhijiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuanzhijiaVO selectVO(Wrapper<XiaoyuanzhijiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuanzhijiaView> selectListView(Wrapper<XiaoyuanzhijiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuanzhijiaView selectView(Wrapper<XiaoyuanzhijiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
