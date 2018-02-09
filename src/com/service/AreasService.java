package com.service;

import java.util.List;

import com.beans.AreasCustom;
import com.beans.AreasQueryVo;

public interface AreasService {
   
	/**
	 * ��ѯȫ���ĵ���
	 * @return
	 */
	public List<AreasCustom> queryareas();
	/**
	 * ����idɾ��������
	 * @param id
	 * @return
	 */
	public boolean deleteareas(int id);
	
	/**
	 * ����ID��ѯ
	 * @param id
	 * @return
	 */
	public AreasCustom  queryareasup(int id);
	
	/**
	 * ȥ���ϼ����ظ�
	 * @return
	 */
	public List<AreasCustom> queryprovince();
	
	/**
	 * ȥ�����͵��ظ�
	 * @return
	 */
	public List<AreasCustom> queryareatype();
	/**
	 * ����ID�޸ĵ���
	 * @param areasQueryVo
	 * @return
	 */
	public boolean updatareas(AreasQueryVo areasQueryVo);
}