package com.service;

import java.util.List;
import com.beans.ClassInfoCustom;
import com.beans.ClassInfoQueryVo;

public interface ClassInfoService {
	public List<ClassInfoCustom> findClassList(ClassInfoQueryVo classInfoQueryVo);
	
	public void addClass(ClassInfoQueryVo classInfoQueryVo);
	
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