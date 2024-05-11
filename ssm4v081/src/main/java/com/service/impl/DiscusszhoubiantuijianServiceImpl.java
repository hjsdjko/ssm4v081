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


import com.dao.DiscusszhoubiantuijianDao;
import com.entity.DiscusszhoubiantuijianEntity;
import com.service.DiscusszhoubiantuijianService;
import com.entity.vo.DiscusszhoubiantuijianVO;
import com.entity.view.DiscusszhoubiantuijianView;

@Service("discusszhoubiantuijianService")
public class DiscusszhoubiantuijianServiceImpl extends ServiceImpl<DiscusszhoubiantuijianDao, DiscusszhoubiantuijianEntity> implements DiscusszhoubiantuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhoubiantuijianEntity> page = this.selectPage(
                new Query<DiscusszhoubiantuijianEntity>(params).getPage(),
                new EntityWrapper<DiscusszhoubiantuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhoubiantuijianEntity> wrapper) {
		  Page<DiscusszhoubiantuijianView> page =new Query<DiscusszhoubiantuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhoubiantuijianVO> selectListVO(Wrapper<DiscusszhoubiantuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhoubiantuijianVO selectVO(Wrapper<DiscusszhoubiantuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhoubiantuijianView> selectListView(Wrapper<DiscusszhoubiantuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhoubiantuijianView selectView(Wrapper<DiscusszhoubiantuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
