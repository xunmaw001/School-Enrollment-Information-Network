package com.entity.view;

import com.entity.XiaoyuanzhijiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园之家
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
@TableName("xiaoyuanzhijia")
public class XiaoyuanzhijiaView  extends XiaoyuanzhijiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyuanzhijiaView(){
	}
 
 	public XiaoyuanzhijiaView(XiaoyuanzhijiaEntity xiaoyuanzhijiaEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyuanzhijiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
