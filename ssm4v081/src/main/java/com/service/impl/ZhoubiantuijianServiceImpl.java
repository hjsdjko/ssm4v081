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


import com.dao.ZhoubiantuijianDao;
import com.entity.ZhoubiantuijianEntity;
import com.service.ZhoubiantuijianService;
import com.entity.vo.ZhoubiantuijianVO;
import com.entity.view.ZhoubiantuijianView;

@Service("zhoubiantuijianService")
public class ZhoubiantuijianServiceImpl extends ServiceImpl<ZhoubiantuijianDao, ZhoubiantuijianEntity> implements ZhoubiantuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhoubiantuijianEntity> page = this.selectPage(
                new Query<ZhoubiantuijianEntity>(params).getPage(),
                new EntityWrapper<ZhoubiantuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhoubiantuijianEntity> wrapper) {
		  Page<ZhoubiantuijianView> page =new Query<ZhoubiantuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhoubiantuijianVO> selectListVO(Wrapper<ZhoubiantuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhoubiantuijianVO selectVO(Wrapper<ZhoubiantuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhoubiantuijianView> selectListView(Wrapper<ZhoubiantuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhoubiantuijianView selectView(Wrapper<ZhoubiantuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
