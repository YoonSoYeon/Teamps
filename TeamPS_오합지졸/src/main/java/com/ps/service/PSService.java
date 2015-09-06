package com.ps.service;

import java.util.List;
import java.util.Map;

import com.ps.vo.GPS;
import com.ps.vo.PS;
//for app
public interface PSService {
	
	public List<PS> all();//모든 ?��코드
	public PS findByNum(String num);//번호�? �??��	
	public List<PS> findByName(String name);//name�? �??��
	public List<PS> findByTitle(String title);//title�? �??��
	public void insert(PS c);//고객 추�?
	public void delete(String num);
	public void update(PS c);

	
}
