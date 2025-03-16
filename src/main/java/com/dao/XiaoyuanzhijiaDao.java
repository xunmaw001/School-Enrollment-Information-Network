package com.dao;

import com.entity.XiaoyuanzhijiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyuanzhijiaVO;
import com.entity.view.XiaoyuanzhijiaView;


/**
 * 校园之家
 * 
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public interface XiaoyuanzhijiaDao extends BaseMapper<XiaoyuanzhijiaEntity> {
	
	List<XiaoyuanzhijiaVO> selectListVO(@Param("ew") Wrapper<XiaoyuanzhijiaEntity> wrapper);
	
	XiaoyuanzhijiaVO selectVO(@Param("ew") Wrapper<XiaoyuanzhijiaEntity> wrapper);
	
	List<XiaoyuanzhijiaView> selectListView(@Param("ew") Wrapper<XiaoyuanzhijiaEntity> wrapper);

	List<XiaoyuanzhijiaView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyuanzhijiaEntity> wrapper);
	
	XiaoyuanzhijiaView selectView(@Param("ew") Wrapper<XiaoyuanzhijiaEntity> wrapper);
	
}
