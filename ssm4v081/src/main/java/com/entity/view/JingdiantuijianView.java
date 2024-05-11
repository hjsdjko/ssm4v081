package com.entity.view;

import com.entity.JingdiantuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 景点推荐
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
@TableName("jingdiantuijian")
public class JingdiantuijianView  extends JingdiantuijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingdiantuijianView(){
	}
 
 	public JingdiantuijianView(JingdiantuijianEntity jingdiantuijianEntity){
 	try {
			BeanUtils.copyProperties(this, jingdiantuijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
