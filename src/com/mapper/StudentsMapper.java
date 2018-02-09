package com.mapper;

import java.util.List;
import com.beans.StudentsCustom;
import com.beans.StudentsQueryVo;
/**
 * 学生类接口
 * @author Administrator
 *
 */
public interface StudentsMapper {
	
	/**
	 * 查询学生信息
	 * @return
	 */
	public List<StudentsCustom> querystudent(StudentsQueryVo studentsQueryVo);
	/**
	 * 根据id删除学生
	 * @param id
	 * @return
	 */
	public boolean deletestudent(int id);
	/**
	 * 根据id修改
	 * @return
	 */
	public StudentsCustom addstudents(int id);
	/**
	 * 新增
	 * @param studentsQueryVo
	 */
	public void addnewstudent(StudentsQueryVo studentsQueryVo);
	/**
	 * 修改
	 * @param studentsQueryVo
	 */
	public void updstnew(StudentsQueryVo studentsQueryVo);
}
