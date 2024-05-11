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


import com.dao.DiscussjingdiantuijianDao;
import com.entity.DiscussjingdiantuijianEntity;
import com.service.DiscussjingdiantuijianService;
import com.entity.vo.DiscussjingdiantuijianVO;
import com.entity.view.DiscussjingdiantuijianView;

@Service("discussjingdiantuijianService")
public class DiscussjingdiantuijianServiceImpl extends ServiceImpl<DiscussjingdiantuijianDao, DiscussjingdiantuijianEntity> implements DiscussjingdiantuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingdiantuijianEntity> page = this.selectPage(
                new Query<DiscussjingdiantuijianEntity>(params).getPage(),
                new EntityWrapper<DiscussjingdiantuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingdiantuijianEntity> wrapper) {
		  Page<DiscussjingdiantuijianView> page =new Query<DiscussjingdiantuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingdiantuijianVO> selectListVO(Wrapper<DiscussjingdiantuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingdiantuijianVO selectVO(Wrapper<DiscussjingdiantuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingdiantuijianView> selectListView(Wrapper<DiscussjingdiantuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingdiantuijianView selectView(Wrapper<DiscussjingdiantuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
