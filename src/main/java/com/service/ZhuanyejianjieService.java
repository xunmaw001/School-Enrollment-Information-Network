package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanyejianjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanyejianjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanyejianjieView;


/**
 * 专业简介
 *
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public interface ZhuanyejianjieService extends IService<ZhuanyejianjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanyejianjieVO> selectListVO(Wrapper<ZhuanyejianjieEntity> wrapper);
   	
   	ZhuanyejianjieVO selectVO(@Param("ew") Wrapper<ZhuanyejianjieEntity> wrapper);
   	
   	List<ZhuanyejianjieView> selectListView(Wrapper<ZhuanyejianjieEntity> wrapper);
   	
   	ZhuanyejianjieView selectView(@Param("ew") Wrapper<ZhuanyejianjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanyejianjieEntity> wrapper);
   	
}

