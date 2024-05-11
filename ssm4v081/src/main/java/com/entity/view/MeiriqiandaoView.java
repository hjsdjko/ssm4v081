package com.entity.view;

import com.entity.MeiriqiandaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 每日签到
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
@TableName("meiriqiandao")
public class MeiriqiandaoView  extends MeiriqiandaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeiriqiandaoView(){
	}
 
 	public MeiriqiandaoView(MeiriqiandaoEntity meiriqiandaoEntity){
 	try {
			BeanUtils.copyProperties(this, meiriqiandaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
