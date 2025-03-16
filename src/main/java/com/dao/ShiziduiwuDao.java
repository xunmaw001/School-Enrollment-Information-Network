package com.dao;

import com.entity.ShiziduiwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiziduiwuVO;
import com.entity.view.ShiziduiwuView;


/**
 * 师资队伍
 * 
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public interface ShiziduiwuDao extends BaseMapper<ShiziduiwuEntity> {
	
	List<ShiziduiwuVO> selectListVO(@Param("ew") Wrapper<ShiziduiwuEntity> wrapper);
	
	ShiziduiwuVO selectVO(@Param("ew") Wrapper<ShiziduiwuEntity> wrapper);
	
	List<ShiziduiwuView> selectListView(@Param("ew") Wrapper<ShiziduiwuEntity> wrapper);

	List<ShiziduiwuView> selectListView(Pagination page,@Param("ew") Wrapper<ShiziduiwuEntity> wrapper);
	
	ShiziduiwuView selectView(@Param("ew") Wrapper<ShiziduiwuEntity> wrapper);
	
}
