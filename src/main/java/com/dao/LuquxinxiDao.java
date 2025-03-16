package com.dao;

import com.entity.LuquxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LuquxinxiVO;
import com.entity.view.LuquxinxiView;


/**
 * 录取信息
 * 
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public interface LuquxinxiDao extends BaseMapper<LuquxinxiEntity> {
	
	List<LuquxinxiVO> selectListVO(@Param("ew") Wrapper<LuquxinxiEntity> wrapper);
	
	LuquxinxiVO selectVO(@Param("ew") Wrapper<LuquxinxiEntity> wrapper);
	
	List<LuquxinxiView> selectListView(@Param("ew") Wrapper<LuquxinxiEntity> wrapper);

	List<LuquxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LuquxinxiEntity> wrapper);
	
	LuquxinxiView selectView(@Param("ew") Wrapper<LuquxinxiEntity> wrapper);
	
}
