package com.dao;

import com.entity.ZhoubiantuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhoubiantuijianVO;
import com.entity.view.ZhoubiantuijianView;


/**
 * 周边推荐
 * 
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface ZhoubiantuijianDao extends BaseMapper<ZhoubiantuijianEntity> {
	
	List<ZhoubiantuijianVO> selectListVO(@Param("ew") Wrapper<ZhoubiantuijianEntity> wrapper);
	
	ZhoubiantuijianVO selectVO(@Param("ew") Wrapper<ZhoubiantuijianEntity> wrapper);
	
	List<ZhoubiantuijianView> selectListView(@Param("ew") Wrapper<ZhoubiantuijianEntity> wrapper);

	List<ZhoubiantuijianView> selectListView(Pagination page,@Param("ew") Wrapper<ZhoubiantuijianEntity> wrapper);
	
	ZhoubiantuijianView selectView(@Param("ew") Wrapper<ZhoubiantuijianEntity> wrapper);
	
}
