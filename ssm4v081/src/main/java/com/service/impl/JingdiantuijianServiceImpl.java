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


import com.dao.JingdiantuijianDao;
import com.entity.JingdiantuijianEntity;
import com.service.JingdiantuijianService;
import com.entity.vo.JingdiantuijianVO;
import com.entity.view.JingdiantuijianView;

@Service("jingdiantuijianService")
public class JingdiantuijianServiceImpl extends ServiceImpl<JingdiantuijianDao, JingdiantuijianEntity> implements JingdiantuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingdiantuijianEntity> page = this.selectPage(
                new Query<JingdiantuijianEntity>(params).getPage(),
                new EntityWrapper<JingdiantuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingdiantuijianEntity> wrapper) {
		  Page<JingdiantuijianView> page =new Query<JingdiantuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingdiantuijianVO> selectListVO(Wrapper<JingdiantuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingdiantuijianVO selectVO(Wrapper<JingdiantuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingdiantuijianView> selectListView(Wrapper<JingdiantuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingdiantuijianView selectView(Wrapper<JingdiantuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
