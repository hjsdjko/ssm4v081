package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FenxiangquanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FenxiangquanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FenxiangquanView;


/**
 * 分享圈
 *
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface FenxiangquanService extends IService<FenxiangquanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FenxiangquanVO> selectListVO(Wrapper<FenxiangquanEntity> wrapper);
   	
   	FenxiangquanVO selectVO(@Param("ew") Wrapper<FenxiangquanEntity> wrapper);
   	
   	List<FenxiangquanView> selectListView(Wrapper<FenxiangquanEntity> wrapper);
   	
   	FenxiangquanView selectView(@Param("ew") Wrapper<FenxiangquanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FenxiangquanEntity> wrapper);
   	
}

