package com.ps.mapper;


import java.util.List;

import com.ps.vo.GIPS;

//for impl
public interface GIPSMapper {
	public List<GIPS> all();//모든 ?��코드
	public void ginsert(GIPS c);//고객 추�?
	public void ginfoinsert(GIPS c);//고객 추�?
	public List<GIPS> findBySearch(String giname);
	public GIPS findByNum(String ginum);
/*	public PS findByNum(String num);//번호�? �??��
	public List<PS> findByName(String name);//title�? �??��
	public List<PS> findBySpdate(String spdate);//name�? �??��
	public List<PS> findByEpdate(String epdate);//name�? �??��
	public List<PS> findByGid(String gid);//name�? �??��
	public void delete(String num);
	public void update(PS c);*/
	
}
	