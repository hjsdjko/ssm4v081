package com.dao;

import com.entity.FenxiangquanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FenxiangquanVO;
import com.entity.view.FenxiangquanView;


/**
 * 分享圈
 * 
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface FenxiangquanDao extends BaseMapper<FenxiangquanEntity> {
	
	List<FenxiangquanVO> selectListVO(@Param("ew") Wrapper<FenxiangquanEntity> wrapper);
	
	FenxiangquanVO selectVO(@Param("ew") Wrapper<FenxiangquanEntity> wrapper);
	
	List<FenxiangquanView> selectListView(@Param("ew") Wrapper<FenxiangquanEntity> wrapper);

	List<FenxiangquanView> selectListView(Pagination page,@Param("ew") Wrapper<FenxiangquanEntity> wrapper);
	
	FenxiangquanView selectView(@Param("ew") Wrapper<FenxiangquanEntity> wrapper);
	
}
