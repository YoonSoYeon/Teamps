package com.ps.mapper;


import java.util.List;

import com.ps.vo.GPS;
import com.ps.vo.MG;

//for impl
public interface MGMapper {
	public List<MG> all();//모든 ?��코드
	public void mginsert(MG c);//고객 추�?
	public void deleteByName(MG m);
	public void deleteByNum(MG m);
	public List<MG> findByName(String gid);
	public MG findByNum(String gmnum);
	
/*	public PS findByNum(String num);//번호�? �??��
	public List<PS> findByName(String name);//title�? �??��
	public List<PS> findBySpdate(String spdate);//name�? �??��
	public List<PS> findByEpdate(String epdate);//name�? �??��
	public List<PS> findByGid(String gid);//name�? �??��
	public void delete(String num);
	public void update(PS c);*/
	
}
	