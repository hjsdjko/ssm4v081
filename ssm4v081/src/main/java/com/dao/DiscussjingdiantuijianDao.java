package com.dao;

import com.entity.DiscussjingdiantuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingdiantuijianVO;
import com.entity.view.DiscussjingdiantuijianView;


/**
 * 景点推荐评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface DiscussjingdiantuijianDao extends BaseMapper<DiscussjingdiantuijianEntity> {
	
	List<DiscussjingdiantuijianVO> selectListVO(@Param("ew") Wrapper<DiscussjingdiantuijianEntity> wrapper);
	
	DiscussjingdiantuijianVO selectVO(@Param("ew") Wrapper<DiscussjingdiantuijianEntity> wrapper);
	
	List<DiscussjingdiantuijianView> selectListView(@Param("ew") Wrapper<DiscussjingdiantuijianEntity> wrapper);

	List<DiscussjingdiantuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingdiantuijianEntity> wrapper);
	
	DiscussjingdiantuijianView selectView(@Param("ew") Wrapper<DiscussjingdiantuijianEntity> wrapper);
	
}
