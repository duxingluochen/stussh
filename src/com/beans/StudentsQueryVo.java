package com.beans;

/**
 * 学生的封装类
 * @author Administrator
 *
 */
public class StudentsQueryVo {
   private Students students;
   private StudentsCustom studentsCustom;
   private ClassInfoCustom classInfoCustom;
public Students getStudents() {
	return students;
}
public void setStudents(Students students) {
	this.students = students;
}
public StudentsCustom getStudentsCustom() {
	return studentsCustom;
}
public void setStudentsCustom(StudentsCustom studentsCustom) {
	this.studentsCustom = studentsCustom;
}
public ClassInfoCustom getClassInfoCustom() {
	return classInfoCustom;
}
public void setClassInfoCustom(ClassInfoCustom classInfoCustom) {
	this.classInfoCustom = classInfoCustom;
}



   
}
