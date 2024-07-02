package com.dao;

import com.entity.JizheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JizheVO;
import com.entity.view.JizheView;


/**
 * 记者
 * 
 * @author 
 * @email 
 * @date 2021-05-12 20:56:50
 */
public interface JizheDao extends BaseMapper<JizheEntity> {
	
	List<JizheVO> selectListVO(@Param("ew") Wrapper<JizheEntity> wrapper);
	
	JizheVO selectVO(@Param("ew") Wrapper<JizheEntity> wrapper);
	
	List<JizheView> selectListView(@Param("ew") Wrapper<JizheEntity> wrapper);

	List<JizheView> selectListView(Pagination page,@Param("ew") Wrapper<JizheEntity> wrapper);
	
	JizheView selectView(@Param("ew") Wrapper<JizheEntity> wrapper);
	
}
