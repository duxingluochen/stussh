package com.mapper;

import java.util.List;
import com.beans.StudentsCustom;
import com.beans.StudentsQueryVo;
/**
 * ѧ����ӿ�
 * @author Administrator
 *
 */
public interface StudentsMapper {
	
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
	public boolean deletestudent(int id);
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