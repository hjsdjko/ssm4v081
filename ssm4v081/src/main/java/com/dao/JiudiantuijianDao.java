package com.dao;

import com.entity.JiudiantuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudiantuijianVO;
import com.entity.view.JiudiantuijianView;


/**
 * 酒店推荐
 * 
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface JiudiantuijianDao extends BaseMapper<JiudiantuijianEntity> {
	
	List<JiudiantuijianVO> selectListVO(@Param("ew") Wrapper<JiudiantuijianEntity> wrapper);
	
	JiudiantuijianVO selectVO(@Param("ew") Wrapper<JiudiantuijianEntity> wrapper);
	
	List<JiudiantuijianView> selectListView(@Param("ew") Wrapper<JiudiantuijianEntity> wrapper);

	List<JiudiantuijianView> selectListView(Pagination page,@Param("ew") Wrapper<JiudiantuijianEntity> wrapper);
	
	JiudiantuijianView selectView(@Param("ew") Wrapper<JiudiantuijianEntity> wrapper);
	
}
