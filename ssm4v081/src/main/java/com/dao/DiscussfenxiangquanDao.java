package com.dao;

import com.entity.DiscussfenxiangquanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfenxiangquanVO;
import com.entity.view.DiscussfenxiangquanView;


/**
 * 分享圈评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface DiscussfenxiangquanDao extends BaseMapper<DiscussfenxiangquanEntity> {
	
	List<DiscussfenxiangquanVO> selectListVO(@Param("ew") Wrapper<DiscussfenxiangquanEntity> wrapper);
	
	DiscussfenxiangquanVO selectVO(@Param("ew") Wrapper<DiscussfenxiangquanEntity> wrapper);
	
	List<DiscussfenxiangquanView> selectListView(@Param("ew") Wrapper<DiscussfenxiangquanEntity> wrapper);

	List<DiscussfenxiangquanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfenxiangquanEntity> wrapper);
	
	DiscussfenxiangquanView selectView(@Param("ew") Wrapper<DiscussfenxiangquanEntity> wrapper);
	
}
