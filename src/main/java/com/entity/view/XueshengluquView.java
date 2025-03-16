package com.entity.view;

import com.entity.XueshengluquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生录取
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
@TableName("xueshengluqu")
public class XueshengluquView  extends XueshengluquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengluquView(){
	}
 
 	public XueshengluquView(XueshengluquEntity xueshengluquEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengluquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
