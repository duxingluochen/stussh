package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.beans.AreasCustom;
import com.beans.AreasQueryVo;
import com.service.AreasService;

@Controller
public class AreasController {
	
	@Resource(name="areasService")
	private AreasService areasService;
	
	/**
	 * ��ѯȫ������Ϣ
	 * @return
	 */
	@RequestMapping("/queryareas.action")
	public ModelAndView queryareas(HttpSession session){
		
		//ȥ���ظ����ϼ�
		 List<AreasCustom> queryprovince = areasService.queryprovince();
		session.setAttribute("queryprovince", queryprovince);
		//ȥ���ظ��ĵ�������
		List<AreasCustom> queryareatype = areasService.queryareatype();
		session.setAttribute("queryareatype", queryareatype);
		
		List<AreasCustom> queryareas = areasService.queryareas();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("queryareas", queryareas);
		modelAndView.setViewName("areas");
		return modelAndView;
	}
	/**
	 * ɾ������idɾ����Ϣ
	 * @param areasid
	 * @return
	 */
	@RequestMapping("/deleteareas.action")
	public String deleteareas(int areasid){
		if(areasService.deleteareas(areasid)){
			return "forward:queryareas.action";
		}; 
		return "error";	
	}
	/**
	 * ����ID��ѯһ��
	 * @param areasid
	 * @return
	 */
	@RequestMapping("/queryareasup.action")
	public ModelAndView queryareasup(int areasid){
		
		AreasCustom quer = areasService.queryareasup(areasid);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("quer", quer);
		modelAndView.setViewName("areasupda");
		return modelAndView;
	}
	
	/**
	 * ����id�޸ĵ���
	 * @param areasQueryVo
	 * @return
	 */
	@RequestMapping("/updatareas.action")
	public String updatareas(AreasQueryVo areasQueryVo){
		if(areasService.updatareas(areasQueryVo)){
			return "forward:queryareas.action";
			}
			return "error";	
	}
}
