package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangyichaxunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangyichaxunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangyichaxunView;


/**
 * 防疫查询
 *
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface FangyichaxunService extends IService<FangyichaxunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangyichaxunVO> selectListVO(Wrapper<FangyichaxunEntity> wrapper);
   	
   	FangyichaxunVO selectVO(@Param("ew") Wrapper<FangyichaxunEntity> wrapper);
   	
   	List<FangyichaxunView> selectListView(Wrapper<FangyichaxunEntity> wrapper);
   	
   	FangyichaxunView selectView(@Param("ew") Wrapper<FangyichaxunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangyichaxunEntity> wrapper);
   	
}

