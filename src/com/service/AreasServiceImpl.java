package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.beans.AreasCustom;
import com.beans.AreasQueryVo;
import com.mapper.AreasMapper;

@Transactional
@Service(value="areasService")
public class AreasServiceImpl implements AreasService {
	
    @Resource(name="areasMapper") 
	private AreasMapper areasMapper;

	@Override
	public List<AreasCustom> queryareas() {
		
		return areasMapper.queryareas();
	}
	
	@Override
	public boolean deleteareas(int id) {
		
		return areasMapper.deleteareas(id);
	}
   
	/**
	 * 根据id查找
	 */
	@Override
	public AreasCustom queryareasup(int id) {
		
		return areasMapper.queryareasup(id);
	}
	/**
	 * 去重查询上级
	 */
	@Override
	public List<AreasCustom> queryprovince() {
		
		return areasMapper.queryprovince();
	}
	/**
	 * 去掉重复的地区类型
	 */
	@Override
	public List<AreasCustom> queryareatype() {
		
		return areasMapper.queryareatype();
	}
	/**
	 * 根据id修改地区
	 */
	@Override
	public boolean updatareas(AreasQueryVo areasQueryVo) {
		
		return areasMapper.updatareas(areasQueryVo);
	}
    
	
    
}
