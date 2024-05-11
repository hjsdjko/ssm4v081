package com.dao;

import com.entity.DiscussmeishituijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeishituijianVO;
import com.entity.view.DiscussmeishituijianView;


/**
 * 美食推荐评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface DiscussmeishituijianDao extends BaseMapper<DiscussmeishituijianEntity> {
	
	List<DiscussmeishituijianVO> selectListVO(@Param("ew") Wrapper<DiscussmeishituijianEntity> wrapper);
	
	DiscussmeishituijianVO selectVO(@Param("ew") Wrapper<DiscussmeishituijianEntity> wrapper);
	
	List<DiscussmeishituijianView> selectListView(@Param("ew") Wrapper<DiscussmeishituijianEntity> wrapper);

	List<DiscussmeishituijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeishituijianEntity> wrapper);
	
	DiscussmeishituijianView selectView(@Param("ew") Wrapper<DiscussmeishituijianEntity> wrapper);
	
}
