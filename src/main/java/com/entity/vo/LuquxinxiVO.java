package com.entity.vo;

import com.entity.LuquxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 录取信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-03 11:52:32
 */
public class LuquxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
