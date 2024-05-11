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


import com.dao.FenxiangquanDao;
import com.entity.FenxiangquanEntity;
import com.service.FenxiangquanService;
import com.entity.vo.FenxiangquanVO;
import com.entity.view.FenxiangquanView;

@Service("fenxiangquanService")
public class FenxiangquanServiceImpl extends ServiceImpl<FenxiangquanDao, FenxiangquanEntity> implements FenxiangquanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FenxiangquanEntity> page = this.selectPage(
                new Query<FenxiangquanEntity>(params).getPage(),
                new EntityWrapper<FenxiangquanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FenxiangquanEntity> wrapper) {
		  Page<FenxiangquanView> page =new Query<FenxiangquanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FenxiangquanVO> selectListVO(Wrapper<FenxiangquanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FenxiangquanVO selectVO(Wrapper<FenxiangquanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FenxiangquanView> selectListView(Wrapper<FenxiangquanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FenxiangquanView selectView(Wrapper<FenxiangquanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
