package com.mapper;

import java.util.List;

import com.beans.AreasCustom;
import com.beans.AreasQueryVo;

/**
 * �������Ľӿ�
 * @author Administrator
 *
 */
public interface AreasMapper {
   
	/**
	 * ��ѯȫ������
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
	 * ȥ���ϼ�
	 * @return
	 */
	public List<AreasCustom> queryprovince();
	
	/**
	 * ȥ������
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