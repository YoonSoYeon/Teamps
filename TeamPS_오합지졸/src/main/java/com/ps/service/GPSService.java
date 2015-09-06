package com.ps.service;

import java.util.List;
import java.util.Map;

import com.ps.vo.GPS;
import com.ps.vo.MG;
import com.ps.vo.PS;
//for app
public interface GPSService {
	
	public List<GPS> all();//모든 ?��코드
	public List<GPS> findBySearch(String gname);//번호�? �??��	
	public void ginsert(GPS c);//고객 추�?
	public void ginfoinsert(String gnum, String gname);//고객 추�?
	public GPS findByName(String name);
	public GPS findByNum(String gnum);
	public GPS findBygname(String gnum);
	public void deleteByNum(GPS m);
	
}
