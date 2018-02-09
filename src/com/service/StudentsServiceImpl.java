package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.beans.StudentsCustom;
import com.beans.StudentsQueryVo;
import com.mapper.StudentsMapper;
@Transactional
@Service(value="studentsService")
public class StudentsServiceImpl implements StudentsService {
	
	@Resource(name="studentsMapper")
	private StudentsMapper studentsMapper;
	
	/**
	 * 查询所有学生信息
	 */
	@Override
	public List<StudentsCustom> querystudent(StudentsQueryVo studentsQueryVo) {
		return studentsMapper.querystudent(studentsQueryVo);
	}
	/**
	 * 根据id删除学生
	 */
	@Override
	public void deletestudent(int id) {
		 studentsMapper.deletestudent(id);
	}
	/**
	 * 根据id修改
	 */
	@Override
	public StudentsCustom addstudents(int id) {
		
		return studentsMapper.addstudents(id);
	}
	/**
	 * 新增
	 */
	@Override
	public void addnewstudent(StudentsQueryVo studentsQueryVo) {
		studentsMapper.addnewstudent(studentsQueryVo);
	}
	/**
	 * 修改
	 */
	@Override
	public void updstnew(StudentsQueryVo studentsQueryVo) {
		studentsMapper.updstnew(studentsQueryVo);	
	}

}
