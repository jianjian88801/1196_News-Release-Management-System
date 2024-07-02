package com.dao;

import com.entity.XinwenfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinwenfenleiVO;
import com.entity.view.XinwenfenleiView;


/**
 * 新闻分类
 * 
 * @author 
 * @email 
 * @date 2021-05-12 20:56:50
 */
public interface XinwenfenleiDao extends BaseMapper<XinwenfenleiEntity> {
	
	List<XinwenfenleiVO> selectListVO(@Param("ew") Wrapper<XinwenfenleiEntity> wrapper);
	
	XinwenfenleiVO selectVO(@Param("ew") Wrapper<XinwenfenleiEntity> wrapper);
	
	List<XinwenfenleiView> selectListView(@Param("ew") Wrapper<XinwenfenleiEntity> wrapper);

	List<XinwenfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<XinwenfenleiEntity> wrapper);
	
	XinwenfenleiView selectView(@Param("ew") Wrapper<XinwenfenleiEntity> wrapper);
	
}
