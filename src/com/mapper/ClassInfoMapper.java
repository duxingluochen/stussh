package com.mapper;

import java.util.List;
import com.beans.ClassInfoCustom;
import com.beans.ClassInfoQueryVo;


public interface ClassInfoMapper {
     /**
      * 根据名字查询班级
      * @param name
      * @return
      */
	public List<ClassInfoCustom> findClassList(ClassInfoQueryVo classInfoQueryVo);
	
	/**
	 * 增加班级
	 * @param classInfoQueryVo
	 * @return
	 */
	public void addClass(ClassInfoQueryVo classInfoQueryVo);
	/**
	 * 根据id删除学生信息
	 * @param id
	 * @return
	 */
	public void deletestudentandclass(int id);
	
	/**
	 * 根据id删除班级
	 * @param id
	 * @return
	 */
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
