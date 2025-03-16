package com.dao;

import com.entity.XueshengluquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengluquVO;
import com.entity.view.XueshengluquView;


/**
 * 学生录取
 * 
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public interface XueshengluquDao extends BaseMapper<XueshengluquEntity> {
	
	List<XueshengluquVO> selectListVO(@Param("ew") Wrapper<XueshengluquEntity> wrapper);
	
	XueshengluquVO selectVO(@Param("ew") Wrapper<XueshengluquEntity> wrapper);
	
	List<XueshengluquView> selectListView(@Param("ew") Wrapper<XueshengluquEntity> wrapper);

	List<XueshengluquView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengluquEntity> wrapper);
	
	XueshengluquView selectView(@Param("ew") Wrapper<XueshengluquEntity> wrapper);
	
}
