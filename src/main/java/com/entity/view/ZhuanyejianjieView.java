package com.entity.view;

import com.entity.ZhuanyejianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 专业简介
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
@TableName("zhuanyejianjie")
public class ZhuanyejianjieView  extends ZhuanyejianjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanyejianjieView(){
	}
 
 	public ZhuanyejianjieView(ZhuanyejianjieEntity zhuanyejianjieEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanyejianjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
