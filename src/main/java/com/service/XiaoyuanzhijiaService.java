package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuanzhijiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuanzhijiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuanzhijiaView;


/**
 * 校园之家
 *
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public interface XiaoyuanzhijiaService extends IService<XiaoyuanzhijiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuanzhijiaVO> selectListVO(Wrapper<XiaoyuanzhijiaEntity> wrapper);
   	
   	XiaoyuanzhijiaVO selectVO(@Param("ew") Wrapper<XiaoyuanzhijiaEntity> wrapper);
   	
   	List<XiaoyuanzhijiaView> selectListView(Wrapper<XiaoyuanzhijiaEntity> wrapper);
   	
   	XiaoyuanzhijiaView selectView(@Param("ew") Wrapper<XiaoyuanzhijiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuanzhijiaEntity> wrapper);
   	
}

