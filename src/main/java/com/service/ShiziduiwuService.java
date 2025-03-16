package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiziduiwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiziduiwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiziduiwuView;


/**
 * 师资队伍
 *
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public interface ShiziduiwuService extends IService<ShiziduiwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiziduiwuVO> selectListVO(Wrapper<ShiziduiwuEntity> wrapper);
   	
   	ShiziduiwuVO selectVO(@Param("ew") Wrapper<ShiziduiwuEntity> wrapper);
   	
   	List<ShiziduiwuView> selectListView(Wrapper<ShiziduiwuEntity> wrapper);
   	
   	ShiziduiwuView selectView(@Param("ew") Wrapper<ShiziduiwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiziduiwuEntity> wrapper);
   	
}

