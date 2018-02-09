package com.beans;
/**
 * µØÇø±í
 * @author Administrator
 *
 */
public class Areas {
  private int areasid;
  private String county;
  private String province;
  private String areatype;
public int getAreasid() {
	return areasid;
}
public void setAreasid(int areasid) {
	this.areasid = areasid;
}
public String getCounty() {
	return county;
}
public void setCounty(String county) {
	this.county = county;
}
public String getProvince() {
	return province;
}
public void setProvince(String province) {
	this.province = province;
}
public String getAreatype() {
	return areatype;
}
public void setAreatype(String areatype) {
	this.areatype = areatype;
}
public Areas(int areasid, String county, String province, String areatype) {
	super();
	this.areasid = areasid;
	this.county = county;
	this.province = province;
	this.areatype = areatype;
}
public Areas(String county, String province, String areatype) {
	super();
	this.county = county;
	this.province = province;
	this.areatype = areatype;
}
public Areas() {
	super();
}
  
  
}
