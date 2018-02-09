package com.beans;

/**
 * °à¼¶bean
 * @author Administrator
 *
 */
public class ClassInfo {
	private int classid;
	private String classname;
	private int cnumber;
	private String classtecher;
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}

	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getCnumber() {
		return cnumber;
	}
	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}
	public String getClasstecher() {
		return classtecher;
	}
	public void setClasstecher(String classtecher) {
		this.classtecher = classtecher;
	}
	public ClassInfo(int classid, String classname, int cnumber,
			String classtecher) {
		super();
		this.classid = classid;
		this.classname = classname;
		this.cnumber = cnumber;
		this.classtecher = classtecher;
	}
	public ClassInfo(String classname, int cnumber, String classtecher) {
		super();
		this.classname = classname;
		this.cnumber = cnumber;
		this.classtecher = classtecher;
	}
	public ClassInfo() {
		super();
	}
	
}
