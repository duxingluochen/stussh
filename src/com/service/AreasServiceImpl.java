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
	 * ����id����
	 */
	@Override
	public AreasCustom queryareasup(int id) {
		
		return areasMapper.queryareasup(id);
	}
	/**
	 * ȥ�ز�ѯ�ϼ�
	 */
	@Override
	public List<AreasCustom> queryprovince() {
		
		return areasMapper.queryprovince();
	}
	/**
	 * ȥ���ظ��ĵ�������
	 */
	@Override
	public List<AreasCustom> queryareatype() {
		
		return areasMapper.queryareatype();
	}
	/**
	 * ����id�޸ĵ���
	 */
	@Override
	public boolean updatareas(AreasQueryVo areasQueryVo) {
		
		return areasMapper.updatareas(areasQueryVo);
	}
    
	
    
}