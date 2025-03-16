package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengluquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengluquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengluquView;


/**
 * 学生录取
 *
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public interface XueshengluquService extends IService<XueshengluquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengluquVO> selectListVO(Wrapper<XueshengluquEntity> wrapper);
   	
   	XueshengluquVO selectVO(@Param("ew") Wrapper<XueshengluquEntity> wrapper);
   	
   	List<XueshengluquView> selectListView(Wrapper<XueshengluquEntity> wrapper);
   	
   	XueshengluquView selectView(@Param("ew") Wrapper<XueshengluquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengluquEntity> wrapper);
   	
}

