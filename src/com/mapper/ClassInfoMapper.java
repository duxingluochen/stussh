package com.mapper;

import java.util.List;
import com.beans.ClassInfoCustom;
import com.beans.ClassInfoQueryVo;


public interface ClassInfoMapper {
     /**
      * �������ֲ�ѯ�༶
      * @param name
      * @return
      */
	public List<ClassInfoCustom> findClassList(ClassInfoQueryVo classInfoQueryVo);
	
	/**
	 * ���Ӱ༶
	 * @param classInfoQueryVo
	 * @return
	 */
	public void addClass(ClassInfoQueryVo classInfoQueryVo);
	/**
	 * ����idɾ��ѧ����Ϣ
	 * @param id
	 * @return
	 */
	public void deletestudentandclass(int id);
	
	/**
	 * ����idɾ���༶
	 * @param id
	 * @return
	 */
	public void deleteclass(int id);
	
	/**
	 * ����id��ѯ
	 * @param id
	 * @return
	 */
	public ClassInfoCustom queryclass(int id);
	/**
	 * ����ID�޸İ༶
	 * @param classInfoQueryVo
	 */
	public boolean updateinfo(ClassInfoQueryVo classInfoQueryVo);
	/**
	 * ��ѯ����
	 * @return
	 */
	public List<ClassInfoCustom> AllQueryClass();

}