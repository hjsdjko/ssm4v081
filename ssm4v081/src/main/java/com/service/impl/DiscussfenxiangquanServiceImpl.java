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


import com.dao.DiscussfenxiangquanDao;
import com.entity.DiscussfenxiangquanEntity;
import com.service.DiscussfenxiangquanService;
import com.entity.vo.DiscussfenxiangquanVO;
import com.entity.view.DiscussfenxiangquanView;

@Service("discussfenxiangquanService")
public class DiscussfenxiangquanServiceImpl extends ServiceImpl<DiscussfenxiangquanDao, DiscussfenxiangquanEntity> implements DiscussfenxiangquanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfenxiangquanEntity> page = this.selectPage(
                new Query<DiscussfenxiangquanEntity>(params).getPage(),
                new EntityWrapper<DiscussfenxiangquanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfenxiangquanEntity> wrapper) {
		  Page<DiscussfenxiangquanView> page =new Query<DiscussfenxiangquanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfenxiangquanVO> selectListVO(Wrapper<DiscussfenxiangquanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfenxiangquanVO selectVO(Wrapper<DiscussfenxiangquanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfenxiangquanView> selectListView(Wrapper<DiscussfenxiangquanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfenxiangquanView selectView(Wrapper<DiscussfenxiangquanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
