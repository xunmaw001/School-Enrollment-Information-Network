package com.entity.vo;

import com.entity.ZhuanyejianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 专业简介
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public class ZhuanyejianjieVO  implements Serializable {
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
