package com.dao;

import com.entity.DiscussjiudiantuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiudiantuijianVO;
import com.entity.view.DiscussjiudiantuijianView;


/**
 * 酒店推荐评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface DiscussjiudiantuijianDao extends BaseMapper<DiscussjiudiantuijianEntity> {
	
	List<DiscussjiudiantuijianVO> selectListVO(@Param("ew") Wrapper<DiscussjiudiantuijianEntity> wrapper);
	
	DiscussjiudiantuijianVO selectVO(@Param("ew") Wrapper<DiscussjiudiantuijianEntity> wrapper);
	
	List<DiscussjiudiantuijianView> selectListView(@Param("ew") Wrapper<DiscussjiudiantuijianEntity> wrapper);

	List<DiscussjiudiantuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiudiantuijianEntity> wrapper);
	
	DiscussjiudiantuijianView selectView(@Param("ew") Wrapper<DiscussjiudiantuijianEntity> wrapper);
	
}
