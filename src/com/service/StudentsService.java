package com.service;

import java.util.List;

import com.beans.StudentsCustom;
import com.beans.StudentsQueryVo;

public interface StudentsService {
    
	/**
	 * ��ѯѧ����Ϣ
	 * @return
	 */
	public List<StudentsCustom> querystudent(StudentsQueryVo studentsQueryVo);
	/**
	 * ����idɾ��ѧ��
	 * @param id
	 * @return
	 */
	public void deletestudent(int id);
	/**
	 * ����id�޸�
	 * @return
	 */
	public StudentsCustom addstudents(int id);
	/**
	 * ����
	 * @param studentsQueryVo
	 */
	public void addnewstudent(StudentsQueryVo studentsQueryVo);
	/**
	 * �޸�
	 * @param studentsQueryVo
	 */
	public void updstnew(StudentsQueryVo studentsQueryVo);
}