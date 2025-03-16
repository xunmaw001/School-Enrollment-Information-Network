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
 * 专业简介
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
@TableName("zhuanyejianjie")
public class ZhuanyejianjieEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhuanyejianjieEntity() {
		
	}
	
	public ZhuanyejianjieEntity(T t) {
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
