package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfenxiangquanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfenxiangquanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfenxiangquanView;


/**
 * 分享圈评论表
 *
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface DiscussfenxiangquanService extends IService<DiscussfenxiangquanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfenxiangquanVO> selectListVO(Wrapper<DiscussfenxiangquanEntity> wrapper);
   	
   	DiscussfenxiangquanVO selectVO(@Param("ew") Wrapper<DiscussfenxiangquanEntity> wrapper);
   	
   	List<DiscussfenxiangquanView> selectListView(Wrapper<DiscussfenxiangquanEntity> wrapper);
   	
   	DiscussfenxiangquanView selectView(@Param("ew") Wrapper<DiscussfenxiangquanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfenxiangquanEntity> wrapper);
   	
}

