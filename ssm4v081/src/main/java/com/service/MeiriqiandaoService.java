package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeiriqiandaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeiriqiandaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeiriqiandaoView;


/**
 * 每日签到
 *
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface MeiriqiandaoService extends IService<MeiriqiandaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeiriqiandaoVO> selectListVO(Wrapper<MeiriqiandaoEntity> wrapper);
   	
   	MeiriqiandaoVO selectVO(@Param("ew") Wrapper<MeiriqiandaoEntity> wrapper);
   	
   	List<MeiriqiandaoView> selectListView(Wrapper<MeiriqiandaoEntity> wrapper);
   	
   	MeiriqiandaoView selectView(@Param("ew") Wrapper<MeiriqiandaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeiriqiandaoEntity> wrapper);
   	
}

