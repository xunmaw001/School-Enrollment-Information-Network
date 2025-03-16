package com.entity.view;

import com.entity.ShiziduiwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 师资队伍
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
@TableName("shiziduiwu")
public class ShiziduiwuView  extends ShiziduiwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiziduiwuView(){
	}
 
 	public ShiziduiwuView(ShiziduiwuEntity shiziduiwuEntity){
 	try {
			BeanUtils.copyProperties(this, shiziduiwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
