package com.beans;

public class Students {
   private int stuid;
   private String stuname;
   private int stunum;
   private int sandcid;
   private String sex;
   private String address;
   private String remark;
   private String photos;
   
   
   public Students(String stuname, int stunum, int sandcid, String sex,
		String address, String remark, String photos, ClassInfo classInfo) {
	super();
	this.stuname = stuname;
	this.stunum = stunum;
	this.sandcid = sandcid;
	this.sex = sex;
	this.address = address;
	this.remark = remark;
	this.photos = photos;
	this.classInfo = classInfo;
}
public Students(int stuid, String stuname, int stunum, int sandcid, String sex,
		String address, String remark, String photos, ClassInfo classInfo) {
	super();
	this.stuid = stuid;
	this.stuname = stuname;
	this.stunum = stunum;
	this.sandcid = sandcid;
	this.sex = sex;
	this.address = address;
	this.remark = remark;
	this.photos = photos;
	this.classInfo = classInfo;
}
private ClassInfo classInfo=new ClassInfo();
   
public ClassInfo getClassInfo() {
	return classInfo;
}
public void setClassInfo(ClassInfo classInfo) {
	this.classInfo = classInfo;
}
public int getStuid() {
	return stuid;
}
public void setStuid(int stuid) {
	this.stuid = stuid;
}
public String getStuname() {
	return stuname;
}
public void setStuname(String stuname) {
	this.stuname = stuname;
}
public int getStunum() {
	return stunum;
}
public void setStunum(int stunum) {
	this.stunum = stunum;
}
public int getSandcid() {
	return sandcid;
}
public void setSandcid(int sandcid) {
	this.sandcid = sandcid;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public String getPhotos() {
	return photos;
}
public void setPhotos(String photos) {
	this.photos = photos;
}
public Students(int stuid, String stuname, int stunum, int sandcid, String sex,
		String address, String remark, String photos) {
	super();
	this.stuid = stuid;
	this.stuname = stuname;
	this.stunum = stunum;
	this.sandcid = sandcid;
	this.sex = sex;
	this.address = address;
	this.remark = remark;
	this.photos = photos;
}
public Students(String stuname, int stunum, int sandcid, String sex,
		String address, String remark, String photos) {
	super();
	this.stuname = stuname;
	this.stunum = stunum;
	this.sandcid = sandcid;
	this.sex = sex;
	this.address = address;
	this.remark = remark;
	this.photos = photos;
}
public Students() {
	super();
}
   
   
}
