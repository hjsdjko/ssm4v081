package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiudiantuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiudiantuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiudiantuijianView;


/**
 * 酒店推荐评论表
 *
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface DiscussjiudiantuijianService extends IService<DiscussjiudiantuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiudiantuijianVO> selectListVO(Wrapper<DiscussjiudiantuijianEntity> wrapper);
   	
   	DiscussjiudiantuijianVO selectVO(@Param("ew") Wrapper<DiscussjiudiantuijianEntity> wrapper);
   	
   	List<DiscussjiudiantuijianView> selectListView(Wrapper<DiscussjiudiantuijianEntity> wrapper);
   	
   	DiscussjiudiantuijianView selectView(@Param("ew") Wrapper<DiscussjiudiantuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiudiantuijianEntity> wrapper);
   	
}

