package com.dao;

import com.entity.ShenpiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenpiyuanVO;
import com.entity.view.ShenpiyuanView;


/**
 * 审批员
 * 
 * @author 
 * @email 
 * @date 2021-05-12 20:56:50
 */
public interface ShenpiyuanDao extends BaseMapper<ShenpiyuanEntity> {
	
	List<ShenpiyuanVO> selectListVO(@Param("ew") Wrapper<ShenpiyuanEntity> wrapper);
	
	ShenpiyuanVO selectVO(@Param("ew") Wrapper<ShenpiyuanEntity> wrapper);
	
	List<ShenpiyuanView> selectListView(@Param("ew") Wrapper<ShenpiyuanEntity> wrapper);

	List<ShenpiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShenpiyuanEntity> wrapper);
	
	ShenpiyuanView selectView(@Param("ew") Wrapper<ShenpiyuanEntity> wrapper);
	
}
