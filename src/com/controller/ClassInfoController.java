package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.beans.ClassInfoCustom;
import com.beans.ClassInfoQueryVo;
import com.service.ClassInfoService;

@Controller
public class ClassInfoController {
    
	@Resource(name="classInfoService")
	private ClassInfoService classInfoService;
	
	/**
	 * ���ݰ༶�����ֲ�ѯ
	 * @param classInfoQueryVo
	 * @return
	 */
	@RequestMapping("/findUser_tbList.action")
	public ModelAndView findUser_tbList(ClassInfoQueryVo classInfoQueryVo){
		List<ClassInfoCustom> list = classInfoService.findClassList(classInfoQueryVo);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("classinfo");
		return modelAndView;	
	}
	
	/**
	 * ���Ӱ༶����ת
	 * @param classInfoQueryVo
	 * @return
	 */
	@RequestMapping("/addclass.action")
	public String upAndAdd(ClassInfoQueryVo classInfoQueryVo){
		classInfoService.addClass(classInfoQueryVo);
		return "classinfo";	
	}
	/**
	 * ɾ���༶
	 * @param classid
	 * @return
	 */
	@RequestMapping("/deleteclass.action")
	public String deleteclass(int classid){
		classInfoService.deleteclass(classid);
		return "forward:findUser_tbList.action";
	}
	
	/**
	 * ����Id��ѯ�༶
	 * @param classid
	 * @return
	 */
	@RequestMapping("/queryclass.action")
	public ModelAndView queryclass(int classid){
		ClassInfoCustom custom = classInfoService.queryclass(classid);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("custom", custom);
		modelAndView.setViewName("updat");
		return modelAndView;	
	}
	/**
	 * ����ID�޸���Ϣ
	 * @param classInfoQueryVo
	 * @return
	 */
	@RequestMapping("/updateinfo.action")
	public String updateinfo(ClassInfoQueryVo classInfoQueryVo){
		if(classInfoService.updateinfo(classInfoQueryVo)){
		return "forward:findUser_tbList.action";
		}
		return "error";
	}
}