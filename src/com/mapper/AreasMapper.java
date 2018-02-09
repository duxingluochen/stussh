package com.mapper;

import java.util.List;

import com.beans.AreasCustom;
import com.beans.AreasQueryVo;

/**
 * 地区表的接口
 * @author Administrator
 *
 */
public interface AreasMapper {
   
	/**
	 * 查询全部地区
	 * @return
	 */
	public List<AreasCustom> queryareas();
	/**
	 * 根据id删除地区表
	 * @param id
	 * @return
	 */
	public boolean deleteareas(int id);
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	public AreasCustom  queryareasup(int id);
	
	/**
	 * 去掉上级
	 * @return
	 */
	public List<AreasCustom> queryprovince();
	
	/**
	 * 去掉类型
	 * @return
	 */
	public List<AreasCustom> queryareatype();
	/**
	 * 根据ID修改地区
	 * @param areasQueryVo
	 * @return
	 */
	public boolean updatareas(AreasQueryVo areasQueryVo);
}
