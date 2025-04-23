package com.yjkj.framework.rbac.message.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.message.model.Message;


public interface MessageDao {

	public List<Message> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Message> informationLoadAll(Message Message) throws Exception;
	
	public Integer count(Message Message) throws Exception;
	
	public Message informationLoadOne(Message Message) throws Exception;
	
	public void informationDelete(Message Message) throws Exception;
	
	public void informationAdd(Message Message) throws Exception;
	
	public void informationUpdate(Message Message) throws Exception;
	
}
