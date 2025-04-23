package com.yjkj.framework.rbac.message.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.message.model.Message;
import com.yjkj.framework.rbac.message.service.inte.MessageService;
@Service("MessageService")
public class MessageServiceImpl extends BaseService implements MessageService {

	
	@Override
	public Pager informationLoad(Pager pager,Message Message,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("message", Message);
		List<Message> list = this.messageDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Message));
		return pager;
	}
	
	@Override
	public Pager informationLoadFore(Pager pager,Message Message,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("message", Message);
		List<Message> list = this.messageDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Message));
		return pager;
	}

	@Override
	public List<Message> informationLoadAll(Message Message) throws Exception {
		List<Message> list = this.messageDao.informationLoadAll(Message);
		return list;
	}
	
	@Override
	public Integer count(Message Message) throws Exception {
		Integer count = this.messageDao.count(Message);
		return count;
	}

	@Override
	public Message informationLoadOne(Message Message) throws Exception {
			Message = this.messageDao.informationLoadOne(Message);
		return Message;
	}

	@Override
	public void informationDelete(Message Message) throws Exception {
			this.messageDao.informationDelete(Message);

	}

	@Override
	public void informationAdd(Message Message) throws Exception {
			Message.setId(Regular.createId());
			Message.setCreatetime(CreatDate.getDate());
			this.messageDao.informationAdd(Message);

	}

	@Override
	public void informationUpade(Message Message) throws Exception {
			this.messageDao.informationUpdate(Message);

	}

}
