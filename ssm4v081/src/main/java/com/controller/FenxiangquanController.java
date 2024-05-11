package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FenxiangquanEntity;
import com.entity.view.FenxiangquanView;

import com.service.FenxiangquanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 分享圈
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-30 17:39:23
 */
@RestController
@RequestMapping("/fenxiangquan")
public class FenxiangquanController {
    @Autowired
    private FenxiangquanService fenxiangquanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FenxiangquanEntity fenxiangquan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			fenxiangquan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FenxiangquanEntity> ew = new EntityWrapper<FenxiangquanEntity>();
		PageUtils page = fenxiangquanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fenxiangquan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FenxiangquanEntity fenxiangquan, HttpServletRequest request){
        EntityWrapper<FenxiangquanEntity> ew = new EntityWrapper<FenxiangquanEntity>();
		PageUtils page = fenxiangquanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fenxiangquan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FenxiangquanEntity fenxiangquan){
       	EntityWrapper<FenxiangquanEntity> ew = new EntityWrapper<FenxiangquanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fenxiangquan, "fenxiangquan")); 
        return R.ok().put("data", fenxiangquanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FenxiangquanEntity fenxiangquan){
        EntityWrapper< FenxiangquanEntity> ew = new EntityWrapper< FenxiangquanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fenxiangquan, "fenxiangquan")); 
		FenxiangquanView fenxiangquanView =  fenxiangquanService.selectView(ew);
		return R.ok("查询分享圈成功").put("data", fenxiangquanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FenxiangquanEntity fenxiangquan = fenxiangquanService.selectById(id);
        return R.ok().put("data", fenxiangquan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FenxiangquanEntity fenxiangquan = fenxiangquanService.selectById(id);
        return R.ok().put("data", fenxiangquan);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        FenxiangquanEntity fenxiangquan = fenxiangquanService.selectById(id);
        if(type.equals("1")) {
        	fenxiangquan.setThumbsupnum(fenxiangquan.getThumbsupnum()+1);
        } else {
        	fenxiangquan.setCrazilynum(fenxiangquan.getCrazilynum()+1);
        }
        fenxiangquanService.updateById(fenxiangquan);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FenxiangquanEntity fenxiangquan, HttpServletRequest request){
    	fenxiangquan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fenxiangquan);

        fenxiangquanService.insert(fenxiangquan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FenxiangquanEntity fenxiangquan, HttpServletRequest request){
    	fenxiangquan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fenxiangquan);

        fenxiangquanService.insert(fenxiangquan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FenxiangquanEntity fenxiangquan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fenxiangquan);
        fenxiangquanService.updateById(fenxiangquan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fenxiangquanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FenxiangquanEntity> wrapper = new EntityWrapper<FenxiangquanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = fenxiangquanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
