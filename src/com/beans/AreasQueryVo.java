package com.beans;

import java.util.List;

/**
 * 地区的包装类
 * @author Administrator
 *
 */
public class AreasQueryVo {
   private Areas areas;
   private AreasCustom areasCustom;
   
   private List<AreasCustom> list;

public Areas getAreas() {
	return areas;
}

public void setAreas(Areas areas) {
	this.areas = areas;
}

public AreasCustom getAreasCustom() {
	return areasCustom;
}

public void setAreasCustom(AreasCustom areasCustom) {
	this.areasCustom = areasCustom;
}

public List<AreasCustom> getList() {
	return list;
}

public void setList(List<AreasCustom> list) {
	this.list = list;
}


   
   
}
