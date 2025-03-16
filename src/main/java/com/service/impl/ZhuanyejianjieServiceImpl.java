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


import com.dao.ZhuanyejianjieDao;
import com.entity.ZhuanyejianjieEntity;
import com.service.ZhuanyejianjieService;
import com.entity.vo.ZhuanyejianjieVO;
import com.entity.view.ZhuanyejianjieView;

@Service("zhuanyejianjieService")
public class ZhuanyejianjieServiceImpl extends ServiceImpl<ZhuanyejianjieDao, ZhuanyejianjieEntity> implements ZhuanyejianjieService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanyejianjieEntity> page = this.selectPage(
                new Query<ZhuanyejianjieEntity>(params).getPage(),
                new EntityWrapper<ZhuanyejianjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanyejianjieEntity> wrapper) {
		  Page<ZhuanyejianjieView> page =new Query<ZhuanyejianjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanyejianjieVO> selectListVO(Wrapper<ZhuanyejianjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanyejianjieVO selectVO(Wrapper<ZhuanyejianjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanyejianjieView> selectListView(Wrapper<ZhuanyejianjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanyejianjieView selectView(Wrapper<ZhuanyejianjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
