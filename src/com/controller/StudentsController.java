package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.beans.ClassInfoCustom;
import com.beans.Students;
import com.beans.StudentsCustom;
import com.beans.StudentsQueryVo;
import com.service.ClassInfoService;
import com.service.StudentsService;

@Controller
public class StudentsController {

	// ѧ��
	@Resource(name = "studentsService")
	private StudentsService studentsService;

	// �༶
	 @Resource(name="classInfoService")
	 private ClassInfoService classInfoService;
	/**
	 * ��ѯѧ����Ϣ
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/querystudent.action")
	public ModelAndView querystudent(HttpSession session,StudentsQueryVo studentsQueryVo) {
		// ��ѯ�༶��Ϣ
		  List<ClassInfoCustom> findClassList =classInfoService.AllQueryClass();
		  session.setAttribute("findClassList", findClassList);
		 
		// ��ѯѧ����Ϣ
		ModelAndView modelAndView = new ModelAndView();
		List<StudentsCustom> querystudent = studentsService.querystudent(studentsQueryVo);
		modelAndView.addObject("querystudent", querystudent);
		modelAndView.setViewName("students");
		return modelAndView;
	}
	/**
	 * ����/�޸�ѧ��ҳ��ǰ�Ĳ�ѯ
	 * @return
	 */
	@RequestMapping("/addstudents.action")
	public ModelAndView addstudents(int stuid) {
		ModelAndView modelAndView = new ModelAndView();
		StudentsCustom upqueryadd = studentsService.addstudents(stuid);
		modelAndView.addObject("upqueryadd", upqueryadd);	
		modelAndView.setViewName("addstudent");
		return modelAndView;
	}
	/**
	 * ����idɾ��
	 * 
	 * @param classid
	 * @return
	 */
	@RequestMapping("/deletestudent.action")
	public String deletestudent(int stuid) {
		studentsService.deletestudent(stuid);
			return "forward:querystudent.action";	
	}
	/**
	 * �޸�����ѧ��
	 * @return
	 */
	@RequestMapping("/updatestude.action")
	public ModelAndView updateStude(int stuid, String stuname, int stunum, int sandcid, String sex,
			String address, String remark, MultipartFile photos){
		//����ͼƬ��
		String pictureFile_name = photos.getOriginalFilename();
		System.out.println(pictureFile_name);
		//���ļ�����
		if(photos!=null&& pictureFile_name!=null &&pictureFile_name.length()>0){
		String newFileName = UUID.randomUUID().toString()+pictureFile_name.substring(pictureFile_name.lastIndexOf("."));
		System.out.println(newFileName);
		//�ϴ�ͼƬ
		File uploadPic = new File("D:/develop/upload/temp/"+newFileName);
		//���·��������,�򴴽��ļ���
		if(!uploadPic.exists()){
			uploadPic.mkdirs();
		}
		//�����д�ļ�
		try {
			photos.transferTo(uploadPic);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StudentsQueryVo studentsQueryVo=new StudentsQueryVo();
		 StudentsCustom studentCustom=new StudentsCustom();
		ModelAndView modelAndView = new ModelAndView();
		studentCustom.setAddress(address);
		studentCustom.setPhotos(newFileName);
		studentCustom.setRemark(remark);
		studentCustom.setSandcid(sandcid);
		studentCustom.setSex(sex);
		studentCustom.setStuname(stuname);
		studentCustom.setStunum(stunum);
		studentCustom.setStuid(stuid);
		studentsQueryVo.setStudentsCustom(studentCustom);
		if(stuid>0){
			
			studentsService.updstnew(studentsQueryVo);
			
		}else{
			
			studentsService.addnewstudent(studentsQueryVo);
		}
		
		
		modelAndView.setViewName("students");
		return modelAndView;
		}
		return null;
	}		
}