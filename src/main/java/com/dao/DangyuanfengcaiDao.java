package com.dao;

import com.entity.DangyuanfengcaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangyuanfengcaiVO;
import com.entity.view.DangyuanfengcaiView;


/**
 * 党员风采
 * 
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public interface DangyuanfengcaiDao extends BaseMapper<DangyuanfengcaiEntity> {
	
	List<DangyuanfengcaiVO> selectListVO(@Param("ew") Wrapper<DangyuanfengcaiEntity> wrapper);
	
	DangyuanfengcaiVO selectVO(@Param("ew") Wrapper<DangyuanfengcaiEntity> wrapper);
	
	List<DangyuanfengcaiView> selectListView(@Param("ew") Wrapper<DangyuanfengcaiEntity> wrapper);

	List<DangyuanfengcaiView> selectListView(Pagination page,@Param("ew") Wrapper<DangyuanfengcaiEntity> wrapper);
	
	DangyuanfengcaiView selectView(@Param("ew") Wrapper<DangyuanfengcaiEntity> wrapper);
	
}
