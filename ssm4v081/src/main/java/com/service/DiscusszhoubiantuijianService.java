package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhoubiantuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhoubiantuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhoubiantuijianView;


/**
 * 周边推荐评论表
 *
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface DiscusszhoubiantuijianService extends IService<DiscusszhoubiantuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhoubiantuijianVO> selectListVO(Wrapper<DiscusszhoubiantuijianEntity> wrapper);
   	
   	DiscusszhoubiantuijianVO selectVO(@Param("ew") Wrapper<DiscusszhoubiantuijianEntity> wrapper);
   	
   	List<DiscusszhoubiantuijianView> selectListView(Wrapper<DiscusszhoubiantuijianEntity> wrapper);
   	
   	DiscusszhoubiantuijianView selectView(@Param("ew") Wrapper<DiscusszhoubiantuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhoubiantuijianEntity> wrapper);
   	
}

