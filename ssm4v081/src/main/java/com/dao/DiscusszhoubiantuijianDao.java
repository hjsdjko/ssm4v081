package com.dao;

import com.entity.DiscusszhoubiantuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhoubiantuijianVO;
import com.entity.view.DiscusszhoubiantuijianView;


/**
 * 周边推荐评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface DiscusszhoubiantuijianDao extends BaseMapper<DiscusszhoubiantuijianEntity> {
	
	List<DiscusszhoubiantuijianVO> selectListVO(@Param("ew") Wrapper<DiscusszhoubiantuijianEntity> wrapper);
	
	DiscusszhoubiantuijianVO selectVO(@Param("ew") Wrapper<DiscusszhoubiantuijianEntity> wrapper);
	
	List<DiscusszhoubiantuijianView> selectListView(@Param("ew") Wrapper<DiscusszhoubiantuijianEntity> wrapper);

	List<DiscusszhoubiantuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhoubiantuijianEntity> wrapper);
	
	DiscusszhoubiantuijianView selectView(@Param("ew") Wrapper<DiscusszhoubiantuijianEntity> wrapper);
	
}
