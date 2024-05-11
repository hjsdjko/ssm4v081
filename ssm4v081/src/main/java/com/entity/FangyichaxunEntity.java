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
 * 防疫查询
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
@TableName("fangyichaxun")
public class FangyichaxunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangyichaxunEntity() {
		
	}
	
	public FangyichaxunEntity(T t) {
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
	 * 地点
	 */
					
	private String didian;
	
	/**
	 * 风险等级
	 */
					
	private String fengxiandengji;
	
	/**
	 * 旅游建议
	 */
					
	private String lvyoujianyi;
	
	
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
	 * 设置：地点
	 */
	public void setDidian(String didian) {
		this.didian = didian;
	}
	/**
	 * 获取：地点
	 */
	public String getDidian() {
		return didian;
	}
	/**
	 * 设置：风险等级
	 */
	public void setFengxiandengji(String fengxiandengji) {
		this.fengxiandengji = fengxiandengji;
	}
	/**
	 * 获取：风险等级
	 */
	public String getFengxiandengji() {
		return fengxiandengji;
	}
	/**
	 * 设置：旅游建议
	 */
	public void setLvyoujianyi(String lvyoujianyi) {
		this.lvyoujianyi = lvyoujianyi;
	}
	/**
	 * 获取：旅游建议
	 */
	public String getLvyoujianyi() {
		return lvyoujianyi;
	}

}
