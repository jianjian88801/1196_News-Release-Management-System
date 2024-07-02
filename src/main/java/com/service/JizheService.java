package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JizheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JizheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JizheView;


/**
 * 记者
 *
 * @author 
 * @email 
 * @date 2021-05-12 20:56:50
 */
public interface JizheService extends IService<JizheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JizheVO> selectListVO(Wrapper<JizheEntity> wrapper);
   	
   	JizheVO selectVO(@Param("ew") Wrapper<JizheEntity> wrapper);
   	
   	List<JizheView> selectListView(Wrapper<JizheEntity> wrapper);
   	
   	JizheView selectView(@Param("ew") Wrapper<JizheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JizheEntity> wrapper);
   	
}

