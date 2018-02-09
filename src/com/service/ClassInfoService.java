package com.service;

import java.util.List;
import com.beans.ClassInfoCustom;
import com.beans.ClassInfoQueryVo;

public interface ClassInfoService {
	public List<ClassInfoCustom> findClassList(ClassInfoQueryVo classInfoQueryVo);
	
	public void addClass(ClassInfoQueryVo classInfoQueryVo);
	
	public void deleteclass(int id);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public ClassInfoCustom queryclass(int id);
	/**
	 * 跟据ID修改班级
	 * @param classInfoQueryVo
	 */
	public boolean updateinfo(ClassInfoQueryVo classInfoQueryVo);
	/**
	 * 查询所有
	 * @return
	 */
	public List<ClassInfoCustom> AllQueryClass();
	

}
