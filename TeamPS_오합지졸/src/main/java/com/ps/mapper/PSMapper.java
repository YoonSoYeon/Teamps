package com.ps.mapper;

import java.util.List;

import com.ps.vo.PS;

//for impl
public interface PSMapper {
	public List<PS> all();//모든 ?��코드
	public void insert(PS c);//고객 추�?
	public PS findByNum(String num);//번호�? �??��
	public List<PS> findByTitle(String title);//title�? �??��
	public List<PS> findByName(String name);//name�? �??��
	public void delete(String num);
	public void update(PS b);
	public List<PS> ByLogin(String id);
	
}
	