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
	 * ��ѯ����ѧ����Ϣ
	 */
	@Override
	public List<StudentsCustom> querystudent(StudentsQueryVo studentsQueryVo) {
		return studentsMapper.querystudent(studentsQueryVo);
	}
	/**
	 * ����idɾ��ѧ��
	 */
	@Override
	public void deletestudent(int id) {
		 studentsMapper.deletestudent(id);
	}
	/**
	 * ����id�޸�
	 */
	@Override
	public StudentsCustom addstudents(int id) {
		
		return studentsMapper.addstudents(id);
	}
	/**
	 * ����
	 */
	@Override
	public void addnewstudent(StudentsQueryVo studentsQueryVo) {
		studentsMapper.addnewstudent(studentsQueryVo);
	}
	/**
	 * �޸�
	 */
	@Override
	public void updstnew(StudentsQueryVo studentsQueryVo) {
		studentsMapper.updstnew(studentsQueryVo);	
	}

}