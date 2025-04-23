package com.yjkj.framework.rbac.part.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.part.model.Part;

public interface PartDao {

	public List<Part> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Part> informationLoadAll(Part Part) throws Exception;
	
	public Integer count(Part Part) throws Exception;
	
	public Part informationLoadOne(Part Part) throws Exception;
	
	public void informationDelete(Part Part) throws Exception;
	
	public void informationAdd(Part Part) throws Exception;
	
	public void informationUpdate(Part Part) throws Exception;
	
}
