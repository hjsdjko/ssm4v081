package com.dao;

import com.entity.JingdiantuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingdiantuijianVO;
import com.entity.view.JingdiantuijianView;


/**
 * 景点推荐
 * 
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface JingdiantuijianDao extends BaseMapper<JingdiantuijianEntity> {
	
	List<JingdiantuijianVO> selectListVO(@Param("ew") Wrapper<JingdiantuijianEntity> wrapper);
	
	JingdiantuijianVO selectVO(@Param("ew") Wrapper<JingdiantuijianEntity> wrapper);
	
	List<JingdiantuijianView> selectListView(@Param("ew") Wrapper<JingdiantuijianEntity> wrapper);

	List<JingdiantuijianView> selectListView(Pagination page,@Param("ew") Wrapper<JingdiantuijianEntity> wrapper);
	
	JingdiantuijianView selectView(@Param("ew") Wrapper<JingdiantuijianEntity> wrapper);
	
}
