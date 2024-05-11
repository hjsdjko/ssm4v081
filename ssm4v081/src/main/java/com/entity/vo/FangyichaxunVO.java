package com.entity.vo;

import com.entity.FangyichaxunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 防疫查询
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public class FangyichaxunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 风险等级
	 */
	
	private String fengxiandengji;
		
	/**
	 * 旅游建议
	 */
	
	private String lvyoujianyi;
				
	
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
