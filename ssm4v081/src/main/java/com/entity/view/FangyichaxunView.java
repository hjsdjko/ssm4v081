package com.entity.view;

import com.entity.FangyichaxunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 防疫查询
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
@TableName("fangyichaxun")
public class FangyichaxunView  extends FangyichaxunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangyichaxunView(){
	}
 
 	public FangyichaxunView(FangyichaxunEntity fangyichaxunEntity){
 	try {
			BeanUtils.copyProperties(this, fangyichaxunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
