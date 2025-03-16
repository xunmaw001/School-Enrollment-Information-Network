package com.entity.vo;

import com.entity.DangyuanfengcaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 党员风采
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public class DangyuanfengcaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 入党时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rudangshijian;
		
	/**
	 * 优秀工作
	 */
	
	private String youxiugongzuo;
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：入党时间
	 */
	 
	public void setRudangshijian(Date rudangshijian) {
		this.rudangshijian = rudangshijian;
	}
	
	/**
	 * 获取：入党时间
	 */
	public Date getRudangshijian() {
		return rudangshijian;
	}
				
	
	/**
	 * 设置：优秀工作
	 */
	 
	public void setYouxiugongzuo(String youxiugongzuo) {
		this.youxiugongzuo = youxiugongzuo;
	}
	
	/**
	 * 获取：优秀工作
	 */
	public String getYouxiugongzuo() {
		return youxiugongzuo;
	}
			
}
