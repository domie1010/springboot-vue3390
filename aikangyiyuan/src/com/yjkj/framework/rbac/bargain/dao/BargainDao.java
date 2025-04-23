package com.yjkj.framework.rbac.bargain.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.bargain.model.Bargain;

public interface BargainDao {

	public List<Bargain> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Bargain> informationLoadAll() throws Exception;
	
	public List<Bargain> informationLoadUser(Bargain bargain) throws Exception;
	
	public Integer count(Bargain bargain) throws Exception;
	
	public Bargain informationLoadOne(Bargain bargain) throws Exception;
	
	public void informationDelete(Bargain bargain) throws Exception;
	
	public void informationAdd(Bargain bargain) throws Exception;
	
	public void informationUpdate(Bargain bargain) throws Exception;
	
}
