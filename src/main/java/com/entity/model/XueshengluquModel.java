package com.entity.model;

import com.entity.XueshengluquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生录取
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public class XueshengluquModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 学生分数
	 */
	
	private Integer xueshengfenshu;
		
	/**
	 * 专业名称
	 */
	
	private String zhuanyemingcheng;
		
	/**
	 * 录取分数
	 */
	
	private Integer luqufenshu;
		
	/**
	 * 录取日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date luquriqi;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：学生分数
	 */
	 
	public void setXueshengfenshu(Integer xueshengfenshu) {
		this.xueshengfenshu = xueshengfenshu;
	}
	
	/**
	 * 获取：学生分数
	 */
	public Integer getXueshengfenshu() {
		return xueshengfenshu;
	}
				
	
	/**
	 * 设置：专业名称
	 */
	 
	public void setZhuanyemingcheng(String zhuanyemingcheng) {
		this.zhuanyemingcheng = zhuanyemingcheng;
	}
	
	/**
	 * 获取：专业名称
	 */
	public String getZhuanyemingcheng() {
		return zhuanyemingcheng;
	}
				
	
	/**
	 * 设置：录取分数
	 */
	 
	public void setLuqufenshu(Integer luqufenshu) {
		this.luqufenshu = luqufenshu;
	}
	
	/**
	 * 获取：录取分数
	 */
	public Integer getLuqufenshu() {
		return luqufenshu;
	}
				
	
	/**
	 * 设置：录取日期
	 */
	 
	public void setLuquriqi(Date luquriqi) {
		this.luquriqi = luquriqi;
	}
	
	/**
	 * 获取：录取日期
	 */
	public Date getLuquriqi() {
		return luquriqi;
	}
			
}
