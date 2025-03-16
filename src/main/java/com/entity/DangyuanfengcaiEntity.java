package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 党员风采
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
@TableName("dangyuanfengcai")
public class DangyuanfengcaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DangyuanfengcaiEntity() {
		
	}
	
	public DangyuanfengcaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date rudangshijian;
	
	/**
	 * 优秀工作
	 */
					
	private String youxiugongzuo;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
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
