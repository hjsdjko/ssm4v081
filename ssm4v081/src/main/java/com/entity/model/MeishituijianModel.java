package com.entity.model;

import com.entity.MeishituijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 美食推荐
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public class MeishituijianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 食物名称
	 */
	
	private String shiwumingcheng;
		
	/**
	 * 食物简介
	 */
	
	private String shiwujianjie;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：食物名称
	 */
	 
	public void setShiwumingcheng(String shiwumingcheng) {
		this.shiwumingcheng = shiwumingcheng;
	}
	
	/**
	 * 获取：食物名称
	 */
	public String getShiwumingcheng() {
		return shiwumingcheng;
	}
				
	
	/**
	 * 设置：食物简介
	 */
	 
	public void setShiwujianjie(String shiwujianjie) {
		this.shiwujianjie = shiwujianjie;
	}
	
	/**
	 * 获取：食物简介
	 */
	public String getShiwujianjie() {
		return shiwujianjie;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
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
