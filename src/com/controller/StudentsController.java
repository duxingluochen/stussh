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

	// 学生
	@Resource(name = "studentsService")
	private StudentsService studentsService;

	// 班级
	 @Resource(name="classInfoService")
	 private ClassInfoService classInfoService;
	/**
	 * 查询学生信息
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/querystudent.action")
	public ModelAndView querystudent(HttpSession session,StudentsQueryVo studentsQueryVo) {
		// 查询班级信息
		  List<ClassInfoCustom> findClassList =classInfoService.AllQueryClass();
		  session.setAttribute("findClassList", findClassList);
		 
		// 查询学生信息
		ModelAndView modelAndView = new ModelAndView();
		List<StudentsCustom> querystudent = studentsService.querystudent(studentsQueryVo);
		modelAndView.addObject("querystudent", querystudent);
		modelAndView.setViewName("students");
		return modelAndView;
	}
	/**
	 * 新增/修改学生页面前的查询
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
	 * 根据id删除
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
	 * 修改新增学生
	 * @return
	 */
	@RequestMapping("/updatestude.action")
	public ModelAndView updateStude(int stuid, String stuname, int stunum, int sandcid, String sex,
			String address, String remark, MultipartFile photos){
		//处理图片的
		String pictureFile_name = photos.getOriginalFilename();
		System.out.println(pictureFile_name);
		//新文件名称
		if(photos!=null&& pictureFile_name!=null &&pictureFile_name.length()>0){
		String newFileName = UUID.randomUUID().toString()+pictureFile_name.substring(pictureFile_name.lastIndexOf("."));
		System.out.println(newFileName);
		//上传图片
		File uploadPic = new File("D:/develop/upload/temp/"+newFileName);
		//如果路径不存在,则创建文件夹
		if(!uploadPic.exists()){
			uploadPic.mkdirs();
		}
		//向磁盘写文件
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
