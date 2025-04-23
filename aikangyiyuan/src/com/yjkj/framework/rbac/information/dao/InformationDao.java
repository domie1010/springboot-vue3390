package com.yjkj.framework.rbac.information.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.information.model.Information;

public interface InformationDao {

	public List<Information> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Information> informationLoadAll() throws Exception;
	
	public Integer count(Information Information) throws Exception;
	
	public Information informationLoadOne(Information Information) throws Exception;
	
	public void informationDelete(Information Information) throws Exception;
	
	public void informationAdd(Information Information) throws Exception;
	
	public void informationUpdate(Information Information) throws Exception;
	
}
