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


import com.dao.FangyichaxunDao;
import com.entity.FangyichaxunEntity;
import com.service.FangyichaxunService;
import com.entity.vo.FangyichaxunVO;
import com.entity.view.FangyichaxunView;

@Service("fangyichaxunService")
public class FangyichaxunServiceImpl extends ServiceImpl<FangyichaxunDao, FangyichaxunEntity> implements FangyichaxunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangyichaxunEntity> page = this.selectPage(
                new Query<FangyichaxunEntity>(params).getPage(),
                new EntityWrapper<FangyichaxunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangyichaxunEntity> wrapper) {
		  Page<FangyichaxunView> page =new Query<FangyichaxunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangyichaxunVO> selectListVO(Wrapper<FangyichaxunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangyichaxunVO selectVO(Wrapper<FangyichaxunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangyichaxunView> selectListView(Wrapper<FangyichaxunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangyichaxunView selectView(Wrapper<FangyichaxunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
