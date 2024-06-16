package com.bikkadit.firstrestapp.studentmodel;

public class student {
	
	
	private int id;
	private String sname;
	private String saddr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", sname=" + sname + ", saddr=" + saddr + "]";
	}
	
	
	

}
