package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingdiantuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingdiantuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingdiantuijianView;


/**
 * 景点推荐
 *
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface JingdiantuijianService extends IService<JingdiantuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingdiantuijianVO> selectListVO(Wrapper<JingdiantuijianEntity> wrapper);
   	
   	JingdiantuijianVO selectVO(@Param("ew") Wrapper<JingdiantuijianEntity> wrapper);
   	
   	List<JingdiantuijianView> selectListView(Wrapper<JingdiantuijianEntity> wrapper);
   	
   	JingdiantuijianView selectView(@Param("ew") Wrapper<JingdiantuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingdiantuijianEntity> wrapper);
   	
}

