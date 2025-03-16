package com.dao;

import com.entity.ZhuanyejianjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanyejianjieVO;
import com.entity.view.ZhuanyejianjieView;


/**
 * 专业简介
 * 
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public interface ZhuanyejianjieDao extends BaseMapper<ZhuanyejianjieEntity> {
	
	List<ZhuanyejianjieVO> selectListVO(@Param("ew") Wrapper<ZhuanyejianjieEntity> wrapper);
	
	ZhuanyejianjieVO selectVO(@Param("ew") Wrapper<ZhuanyejianjieEntity> wrapper);
	
	List<ZhuanyejianjieView> selectListView(@Param("ew") Wrapper<ZhuanyejianjieEntity> wrapper);

	List<ZhuanyejianjieView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanyejianjieEntity> wrapper);
	
	ZhuanyejianjieView selectView(@Param("ew") Wrapper<ZhuanyejianjieEntity> wrapper);
	
}
