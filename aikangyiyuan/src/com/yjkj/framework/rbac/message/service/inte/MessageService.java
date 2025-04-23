package com.yjkj.framework.rbac.message.service.inte;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.message.model.Message;

public interface MessageService {

	public Pager informationLoad(Pager pager,Message Message,HttpSession session) throws Exception;
	
	public Pager informationLoadFore(Pager pager,Message Message,HttpSession session) throws Exception;
	
	public List<Message> informationLoadAll(Message Message) throws Exception;
	
	public Integer count(Message Message) throws Exception;
	
	public Message informationLoadOne(Message Message) throws Exception;
	
	public void informationDelete(Message Message) throws Exception;
	
	public void informationAdd(Message Message) throws Exception;
	
	public void informationUpade(Message Message) throws Exception;
	
}
