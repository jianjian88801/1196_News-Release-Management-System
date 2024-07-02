package com.entity.view;

import com.entity.ShenpiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 审批员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 20:56:50
 */
@TableName("shenpiyuan")
public class ShenpiyuanView  extends ShenpiyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenpiyuanView(){
	}
 
 	public ShenpiyuanView(ShenpiyuanEntity shenpiyuanEntity){
 	try {
			BeanUtils.copyProperties(this, shenpiyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
