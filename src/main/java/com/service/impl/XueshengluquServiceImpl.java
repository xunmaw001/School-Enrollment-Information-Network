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


import com.dao.XueshengluquDao;
import com.entity.XueshengluquEntity;
import com.service.XueshengluquService;
import com.entity.vo.XueshengluquVO;
import com.entity.view.XueshengluquView;

@Service("xueshengluquService")
public class XueshengluquServiceImpl extends ServiceImpl<XueshengluquDao, XueshengluquEntity> implements XueshengluquService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengluquEntity> page = this.selectPage(
                new Query<XueshengluquEntity>(params).getPage(),
                new EntityWrapper<XueshengluquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengluquEntity> wrapper) {
		  Page<XueshengluquView> page =new Query<XueshengluquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengluquVO> selectListVO(Wrapper<XueshengluquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengluquVO selectVO(Wrapper<XueshengluquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengluquView> selectListView(Wrapper<XueshengluquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengluquView selectView(Wrapper<XueshengluquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
