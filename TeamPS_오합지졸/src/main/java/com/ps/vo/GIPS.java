package com.ps.vo;
//board ??΄λΈμ ?? vo

public class GIPS {

	private String ginum, giname, gidnum;
	//1.data -7κ°?
	//2.getter/setter
	//3.??±? : (), 7 κ°μ§λ¦?

	public GIPS() {
		
	}

	public GIPS(String ginum, String giname, String gidnum) {
		super();
		this.ginum = ginum;
		this.giname = giname;
		this.gidnum = gidnum;
	}

	public String getGinum() {
		return ginum;
	}

	public void setGinum(String ginum) {
		this.ginum = ginum;
	}

	public String getGiname() {
		return giname;
	}

	public void setGiname(String giname) {
		this.giname = giname;
	}

	public String getGidnum() {
		return gidnum;
	}

	public void setGidnum(String gidnum) {
		this.gidnum = gidnum;
	}

	
	
}
