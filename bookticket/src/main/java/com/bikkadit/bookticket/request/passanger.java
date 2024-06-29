package com.bikkadit.bookticket.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class passanger {
	
	private int pid;
	private String pname;
	private String to;
	private String from;
	private String doj;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "passanger [pid=" + pid + ", pname=" + pname + ", to=" + to + ", from=" + from + ", doj=" + doj + "]";
	}
	
	
	

}
