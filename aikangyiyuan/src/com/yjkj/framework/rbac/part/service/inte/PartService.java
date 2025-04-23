package com.yjkj.framework.rbac.part.service.inte;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.part.model.Part;

public interface PartService {

	public Pager informationLoad(Pager pager,Part Part,HttpSession session) throws Exception;
	
	public Pager informationLoadFore(Pager pager,Part Part,HttpSession session) throws Exception;
	
	public List<Part> informationLoadAll(Part Part) throws Exception;
	
	public Integer count(Part Part) throws Exception;
	
	public Part informationLoadOne(Part Part) throws Exception;
	
	public void informationDelete(Part Part) throws Exception;
	
	public void informationAdd(Part Part) throws Exception;
	
	public void informationUpade(Part Part) throws Exception;
	
}
