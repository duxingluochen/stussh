package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.beans.ClassInfo;
import com.beans.ClassInfoCustom;
import com.beans.ClassInfoQueryVo;
import com.mapper.ClassInfoMapper;

@Transactional
@Service(value="classInfoService")
public class ClassInfoServiceImpl implements ClassInfoService {
	
	@Resource(name="classInfoMapper")
	private ClassInfoMapper classInfoMapper;
	
	@Override
	public List<ClassInfoCustom> findClassList(ClassInfoQueryVo classInfoQueryVo) {
		
		return classInfoMapper.findClassList(classInfoQueryVo);
	}

	/**
	 * �����༶
	 */
	@Override
	public void addClass(ClassInfoQueryVo classInfoQueryVo) {
		classInfoMapper.addClass(classInfoQueryVo);
	}

	/**
	 * ɾ���༶
	 */
	@Override
	public void deleteclass(int id) {
		 classInfoMapper.deletestudentandclass(id);
		 classInfoMapper.deleteclass(id);
			
		
		
	}

	/**
	 * ����id��ѯ�༶
	 */
	@Override
	public ClassInfoCustom queryclass(int id) {
		
		return classInfoMapper.queryclass(id);
	}

	/**
	 * �޸İ༶
	 */
	@Override
	public boolean updateinfo(ClassInfoQueryVo classInfoQueryVo) {
		return classInfoMapper.updateinfo(classInfoQueryVo);
		
	}

	/**
	 * ��ѯ����
	 */
	@Override
	public List<ClassInfoCustom> AllQueryClass() {
		
		return classInfoMapper.AllQueryClass();
	}
}
