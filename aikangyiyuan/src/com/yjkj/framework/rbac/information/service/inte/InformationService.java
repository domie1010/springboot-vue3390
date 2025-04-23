package com.yjkj.framework.rbac.information.service.inte;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.information.model.Information;

public interface InformationService {

	public Pager informationLoad(Pager pager,Information Information,HttpSession session) throws Exception;
	
	public List<Information> informationLoadAll() throws Exception;
	
	public Integer count(Information Information) throws Exception;
	
	public Information informationLoadOne(Information Information) throws Exception;
	
	public void informationDelete(Information Information) throws Exception;
	
	public void informationAdd(Information Information) throws Exception;
	
	public void informationUpade(Information Information) throws Exception;
	
}
