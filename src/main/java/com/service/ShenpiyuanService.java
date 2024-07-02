package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenpiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenpiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenpiyuanView;


/**
 * 审批员
 *
 * @author 
 * @email 
 * @date 2021-05-12 20:56:50
 */
public interface ShenpiyuanService extends IService<ShenpiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenpiyuanVO> selectListVO(Wrapper<ShenpiyuanEntity> wrapper);
   	
   	ShenpiyuanVO selectVO(@Param("ew") Wrapper<ShenpiyuanEntity> wrapper);
   	
   	List<ShenpiyuanView> selectListView(Wrapper<ShenpiyuanEntity> wrapper);
   	
   	ShenpiyuanView selectView(@Param("ew") Wrapper<ShenpiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenpiyuanEntity> wrapper);
   	
}

