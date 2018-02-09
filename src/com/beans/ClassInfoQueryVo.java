package com.beans;

import java.util.List;

/**
 * 班级包装类
 * @author Administrator
 *
 */
public class ClassInfoQueryVo {
   private ClassInfo classinfo;
   private ClassInfoCustom classinfocustom;
   
   private List<ClassInfoCustom> list;

public ClassInfo getClassinfo() {
	return classinfo;
}

public void setClassinfo(ClassInfo classinfo) {
	this.classinfo = classinfo;
}

public ClassInfoCustom getClassinfocustom() {
	return classinfocustom;
}

public void setClassinfocustom(ClassInfoCustom classinfocustom) {
	this.classinfocustom = classinfocustom;
}

public List<ClassInfoCustom> getList() {
	return list;
}

public void setList(List<ClassInfoCustom> list) {
	this.list = list;
}
   

}
