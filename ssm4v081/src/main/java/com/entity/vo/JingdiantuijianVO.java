package com.entity.vo;

import com.entity.JingdiantuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 景点推荐
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public class JingdiantuijianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景点名称
	 */
	
	private String jingdianmingcheng;
		
	/**
	 * 景点类别
	 */
	
	private String jingdianleibie;
		
	/**
	 * 景点地址
	 */
	
	private String jingdiandizhi;
		
	/**
	 * 景点图片
	 */
	
	private String jingdiantupian;
		
	/**
	 * 景点介绍
	 */
	
	private String jingdianjieshao;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：景点名称
	 */
	 
	public void setJingdianmingcheng(String jingdianmingcheng) {
		this.jingdianmingcheng = jingdianmingcheng;
	}
	
	/**
	 * 获取：景点名称
	 */
	public String getJingdianmingcheng() {
		return jingdianmingcheng;
	}
				
	
	/**
	 * 设置：景点类别
	 */
	 
	public void setJingdianleibie(String jingdianleibie) {
		this.jingdianleibie = jingdianleibie;
	}
	
	/**
	 * 获取：景点类别
	 */
	public String getJingdianleibie() {
		return jingdianleibie;
	}
				
	
	/**
	 * 设置：景点地址
	 */
	 
	public void setJingdiandizhi(String jingdiandizhi) {
		this.jingdiandizhi = jingdiandizhi;
	}
	
	/**
	 * 获取：景点地址
	 */
	public String getJingdiandizhi() {
		return jingdiandizhi;
	}
				
	
	/**
	 * 设置：景点图片
	 */
	 
	public void setJingdiantupian(String jingdiantupian) {
		this.jingdiantupian = jingdiantupian;
	}
	
	/**
	 * 获取：景点图片
	 */
	public String getJingdiantupian() {
		return jingdiantupian;
	}
				
	
	/**
	 * 设置：景点介绍
	 */
	 
	public void setJingdianjieshao(String jingdianjieshao) {
		this.jingdianjieshao = jingdianjieshao;
	}
	
	/**
	 * 获取：景点介绍
	 */
	public String getJingdianjieshao() {
		return jingdianjieshao;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
