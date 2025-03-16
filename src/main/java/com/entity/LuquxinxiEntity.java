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
 * 录取信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
@TableName("luquxinxi")
public class LuquxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LuquxinxiEntity() {
		
	}
	
	public LuquxinxiEntity(T t) {
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
	 * 专业名称
	 */
					
	private String zhuanyemingcheng;
	
	/**
	 * 年限
	 */
					
	private String nianxian;
	
	/**
	 * 录取分数
	 */
					
	private String luqufenshu;
	
	/**
	 * 录取人数
	 */
					
	private String luqurenshu;
	
	
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
	 * 设置：年限
	 */
	public void setNianxian(String nianxian) {
		this.nianxian = nianxian;
	}
	/**
	 * 获取：年限
	 */
	public String getNianxian() {
		return nianxian;
	}
	/**
	 * 设置：录取分数
	 */
	public void setLuqufenshu(String luqufenshu) {
		this.luqufenshu = luqufenshu;
	}
	/**
	 * 获取：录取分数
	 */
	public String getLuqufenshu() {
		return luqufenshu;
	}
	/**
	 * 设置：录取人数
	 */
	public void setLuqurenshu(String luqurenshu) {
		this.luqurenshu = luqurenshu;
	}
	/**
	 * 获取：录取人数
	 */
	public String getLuqurenshu() {
		return luqurenshu;
	}

}
