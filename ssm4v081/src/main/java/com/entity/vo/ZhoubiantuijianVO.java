package com.entity.vo;

import com.entity.ZhoubiantuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 周边推荐
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public class ZhoubiantuijianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景点地址
	 */
	
	private String jingdiandizhi;
		
	/**
	 * 周边名称
	 */
	
	private String zhoubianmingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 推荐理由
	 */
	
	private String tuijianliyou;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
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
	 * 设置：周边名称
	 */
	 
	public void setZhoubianmingcheng(String zhoubianmingcheng) {
		this.zhoubianmingcheng = zhoubianmingcheng;
	}
	
	/**
	 * 获取：周边名称
	 */
	public String getZhoubianmingcheng() {
		return zhoubianmingcheng;
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
	 * 设置：推荐理由
	 */
	 
	public void setTuijianliyou(String tuijianliyou) {
		this.tuijianliyou = tuijianliyou;
	}
	
	/**
	 * 获取：推荐理由
	 */
	public String getTuijianliyou() {
		return tuijianliyou;
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
