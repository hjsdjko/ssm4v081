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


import com.dao.DiscussjiudiantuijianDao;
import com.entity.DiscussjiudiantuijianEntity;
import com.service.DiscussjiudiantuijianService;
import com.entity.vo.DiscussjiudiantuijianVO;
import com.entity.view.DiscussjiudiantuijianView;

@Service("discussjiudiantuijianService")
public class DiscussjiudiantuijianServiceImpl extends ServiceImpl<DiscussjiudiantuijianDao, DiscussjiudiantuijianEntity> implements DiscussjiudiantuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiudiantuijianEntity> page = this.selectPage(
                new Query<DiscussjiudiantuijianEntity>(params).getPage(),
                new EntityWrapper<DiscussjiudiantuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiudiantuijianEntity> wrapper) {
		  Page<DiscussjiudiantuijianView> page =new Query<DiscussjiudiantuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiudiantuijianVO> selectListVO(Wrapper<DiscussjiudiantuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiudiantuijianVO selectVO(Wrapper<DiscussjiudiantuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiudiantuijianView> selectListView(Wrapper<DiscussjiudiantuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiudiantuijianView selectView(Wrapper<DiscussjiudiantuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
