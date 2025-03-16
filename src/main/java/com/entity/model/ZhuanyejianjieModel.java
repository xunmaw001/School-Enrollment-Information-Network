package com.entity.model;

import com.entity.ZhuanyejianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 专业简介
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public class ZhuanyejianjieModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 专业简介
	 */
	
	private String zhuanyejianjie;
		
	/**
	 * 报考须知
	 */
	
	private String baokaoxuzhi;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：专业简介
	 */
	 
	public void setZhuanyejianjie(String zhuanyejianjie) {
		this.zhuanyejianjie = zhuanyejianjie;
	}
	
	/**
	 * 获取：专业简介
	 */
	public String getZhuanyejianjie() {
		return zhuanyejianjie;
	}
				
	
	/**
	 * 设置：报考须知
	 */
	 
	public void setBaokaoxuzhi(String baokaoxuzhi) {
		this.baokaoxuzhi = baokaoxuzhi;
	}
	
	/**
	 * 获取：报考须知
	 */
	public String getBaokaoxuzhi() {
		return baokaoxuzhi;
	}
			
}
