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


import com.dao.MeiriqiandaoDao;
import com.entity.MeiriqiandaoEntity;
import com.service.MeiriqiandaoService;
import com.entity.vo.MeiriqiandaoVO;
import com.entity.view.MeiriqiandaoView;

@Service("meiriqiandaoService")
public class MeiriqiandaoServiceImpl extends ServiceImpl<MeiriqiandaoDao, MeiriqiandaoEntity> implements MeiriqiandaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeiriqiandaoEntity> page = this.selectPage(
                new Query<MeiriqiandaoEntity>(params).getPage(),
                new EntityWrapper<MeiriqiandaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeiriqiandaoEntity> wrapper) {
		  Page<MeiriqiandaoView> page =new Query<MeiriqiandaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeiriqiandaoVO> selectListVO(Wrapper<MeiriqiandaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeiriqiandaoVO selectVO(Wrapper<MeiriqiandaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeiriqiandaoView> selectListView(Wrapper<MeiriqiandaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeiriqiandaoView selectView(Wrapper<MeiriqiandaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
