package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudiantuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiudiantuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudiantuijianView;


/**
 * 酒店推荐
 *
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface JiudiantuijianService extends IService<JiudiantuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudiantuijianVO> selectListVO(Wrapper<JiudiantuijianEntity> wrapper);
   	
   	JiudiantuijianVO selectVO(@Param("ew") Wrapper<JiudiantuijianEntity> wrapper);
   	
   	List<JiudiantuijianView> selectListView(Wrapper<JiudiantuijianEntity> wrapper);
   	
   	JiudiantuijianView selectView(@Param("ew") Wrapper<JiudiantuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudiantuijianEntity> wrapper);
   	
}

