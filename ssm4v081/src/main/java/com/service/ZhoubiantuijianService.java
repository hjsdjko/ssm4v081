package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhoubiantuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhoubiantuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhoubiantuijianView;


/**
 * 周边推荐
 *
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface ZhoubiantuijianService extends IService<ZhoubiantuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhoubiantuijianVO> selectListVO(Wrapper<ZhoubiantuijianEntity> wrapper);
   	
   	ZhoubiantuijianVO selectVO(@Param("ew") Wrapper<ZhoubiantuijianEntity> wrapper);
   	
   	List<ZhoubiantuijianView> selectListView(Wrapper<ZhoubiantuijianEntity> wrapper);
   	
   	ZhoubiantuijianView selectView(@Param("ew") Wrapper<ZhoubiantuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhoubiantuijianEntity> wrapper);
   	
}

