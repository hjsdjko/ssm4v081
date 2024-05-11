package com.dao;

import com.entity.FangyichaxunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangyichaxunVO;
import com.entity.view.FangyichaxunView;


/**
 * 防疫查询
 * 
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
public interface FangyichaxunDao extends BaseMapper<FangyichaxunEntity> {
	
	List<FangyichaxunVO> selectListVO(@Param("ew") Wrapper<FangyichaxunEntity> wrapper);
	
	FangyichaxunVO selectVO(@Param("ew") Wrapper<FangyichaxunEntity> wrapper);
	
	List<FangyichaxunView> selectListView(@Param("ew") Wrapper<FangyichaxunEntity> wrapper);

	List<FangyichaxunView> selectListView(Pagination page,@Param("ew") Wrapper<FangyichaxunEntity> wrapper);
	
	FangyichaxunView selectView(@Param("ew") Wrapper<FangyichaxunEntity> wrapper);
	
}
