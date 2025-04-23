package com.yjkj.framework.rbac.bargain.service.inte;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.bargain.model.Bargain;

public interface BargainService {

	public Pager informationLoad(Pager pager,Bargain bargain,HttpSession session) throws Exception;
	
	public Pager informationLoadFore(Pager pager,Bargain bargain,HttpSession session) throws Exception;
	
	public List<Bargain> informationLoadAll() throws Exception;
	
	public List<Bargain> informationLoadUser(HttpSession session) throws Exception;
	
	public Integer count(Bargain bargain) throws Exception;
	
	public Bargain informationLoadOne(Bargain bargain) throws Exception;
	
	public void informationDelete(Bargain bargain) throws Exception;
	
	public void informationAdd(Bargain bargain) throws Exception;
	
	public void informationUpade(Bargain bargain) throws Exception;
	
}
