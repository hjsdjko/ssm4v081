package com.dao;

import com.entity.MeiriqiandaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeiriqiandaoVO;
import com.entity.view.MeiriqiandaoView;


/**
 * 每日签到
 * 
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface MeiriqiandaoDao extends BaseMapper<MeiriqiandaoEntity> {
	
	List<MeiriqiandaoVO> selectListVO(@Param("ew") Wrapper<MeiriqiandaoEntity> wrapper);
	
	MeiriqiandaoVO selectVO(@Param("ew") Wrapper<MeiriqiandaoEntity> wrapper);
	
	List<MeiriqiandaoView> selectListView(@Param("ew") Wrapper<MeiriqiandaoEntity> wrapper);

	List<MeiriqiandaoView> selectListView(Pagination page,@Param("ew") Wrapper<MeiriqiandaoEntity> wrapper);
	
	MeiriqiandaoView selectView(@Param("ew") Wrapper<MeiriqiandaoEntity> wrapper);
	
}
