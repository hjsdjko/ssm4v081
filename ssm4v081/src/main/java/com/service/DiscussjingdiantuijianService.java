package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingdiantuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingdiantuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingdiantuijianView;


/**
 * 景点推荐评论表
 *
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface DiscussjingdiantuijianService extends IService<DiscussjingdiantuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingdiantuijianVO> selectListVO(Wrapper<DiscussjingdiantuijianEntity> wrapper);
   	
   	DiscussjingdiantuijianVO selectVO(@Param("ew") Wrapper<DiscussjingdiantuijianEntity> wrapper);
   	
   	List<DiscussjingdiantuijianView> selectListView(Wrapper<DiscussjingdiantuijianEntity> wrapper);
   	
   	DiscussjingdiantuijianView selectView(@Param("ew") Wrapper<DiscussjingdiantuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingdiantuijianEntity> wrapper);
   	
}

