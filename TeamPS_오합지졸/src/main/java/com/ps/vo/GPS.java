package com.ps.vo;
//board ?��?��블을 ?��?�� vo

public class GPS {

	private String gnum, gname, spdate, epdate;
	//1.data -7�?
	//2.getter/setter
	//3.?��?��?�� : (), 7 개짜�?
	public GPS() {
		
	}

	
	public GPS(String gnum, String gname, String spdate, String epdate) {
		super();
		this.gnum = gnum;
		this.gname = gname;
		this.spdate = spdate;
		this.epdate = epdate;
	
	}



	public String getGnum() {
		return gnum;
	}
	public void setGnum(String gnum) {
		this.gnum = gnum;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getSpdate() {
		return spdate;
	}
	public void setSpdate(String spdate) {
		this.spdate = spdate;
	}
	public String getEpdate() {
		return epdate;
	}
	public void setEpdate(String epdate) {
		this.epdate = epdate;
	}

	
}
