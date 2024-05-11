package com.entity.view;

import com.entity.DiscussjiudiantuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店推荐评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
@TableName("discussjiudiantuijian")
public class DiscussjiudiantuijianView  extends DiscussjiudiantuijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiudiantuijianView(){
	}
 
 	public DiscussjiudiantuijianView(DiscussjiudiantuijianEntity discussjiudiantuijianEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiudiantuijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
