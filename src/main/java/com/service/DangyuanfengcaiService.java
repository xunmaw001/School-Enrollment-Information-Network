package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangyuanfengcaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangyuanfengcaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangyuanfengcaiView;


/**
 * 党员风采
 *
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public interface DangyuanfengcaiService extends IService<DangyuanfengcaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangyuanfengcaiVO> selectListVO(Wrapper<DangyuanfengcaiEntity> wrapper);
   	
   	DangyuanfengcaiVO selectVO(@Param("ew") Wrapper<DangyuanfengcaiEntity> wrapper);
   	
   	List<DangyuanfengcaiView> selectListView(Wrapper<DangyuanfengcaiEntity> wrapper);
   	
   	DangyuanfengcaiView selectView(@Param("ew") Wrapper<DangyuanfengcaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangyuanfengcaiEntity> wrapper);
   	
}

