package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiudiantuijianDao;
import com.entity.JiudiantuijianEntity;
import com.service.JiudiantuijianService;
import com.entity.vo.JiudiantuijianVO;
import com.entity.view.JiudiantuijianView;

@Service("jiudiantuijianService")
public class JiudiantuijianServiceImpl extends ServiceImpl<JiudiantuijianDao, JiudiantuijianEntity> implements JiudiantuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudiantuijianEntity> page = this.selectPage(
                new Query<JiudiantuijianEntity>(params).getPage(),
                new EntityWrapper<JiudiantuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudiantuijianEntity> wrapper) {
		  Page<JiudiantuijianView> page =new Query<JiudiantuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiudiantuijianVO> selectListVO(Wrapper<JiudiantuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiudiantuijianVO selectVO(Wrapper<JiudiantuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiudiantuijianView> selectListView(Wrapper<JiudiantuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudiantuijianView selectView(Wrapper<JiudiantuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
