package com.ps.vo;
//board ?��?��블을 ?��?�� vo

public class MG {


	private String gmnum, gid,gmid, gname;
	//1.data -7�?
	//2.getter/setter
	//3.?��?��?�� : (), 7 개짜�?
	public MG() {
		
	}
	public MG(String gmnum, String gid, String gmid, String gname) {
		super();
		this.gmnum = gmnum;
		this.gid = gid;
		this.gmid = gmid;
		this.gname = gname;
	}
	public String getGmnum() {
		return gmnum;
	}
	public void setGmnum(String gmnum) {
		this.gmnum = gmnum;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getGmid() {
		return gmid;
	}
	public void setGmid(String gmid) {
		this.gmid = gmid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	
	
}
