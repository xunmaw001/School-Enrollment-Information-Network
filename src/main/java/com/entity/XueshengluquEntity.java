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
 * 学生录取
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
@TableName("xueshengluqu")
public class XueshengluquEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshengluquEntity() {
		
	}
	
	public XueshengluquEntity(T t) {
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
	 * 学生号
	 */
					
	private String xueshenghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date luquriqi;
	
	
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
	 * 设置：学生号
	 */
	public void setXueshenghao(String xueshenghao) {
		this.xueshenghao = xueshenghao;
	}
	/**
	 * 获取：学生号
	 */
	public String getXueshenghao() {
		return xueshenghao;
	}
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
