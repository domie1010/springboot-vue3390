package com.yjkj.framework.base.basemodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjkj.framework.rbac.about.dao.AboutDao;
import com.yjkj.framework.rbac.bargain.dao.BargainDao;
import com.yjkj.framework.rbac.doctor.dao.DoctorDao;
import com.yjkj.framework.rbac.information.dao.InformationDao;
import com.yjkj.framework.rbac.introduce.dao.IntroduceDao;
import com.yjkj.framework.rbac.message.dao.MessageDao;
import com.yjkj.framework.rbac.notice.dao.NoticeDao;
import com.yjkj.framework.rbac.part.dao.PartDao;

@Service
public class BaseService {
	
	@Autowired
	public BargainDao bargainDao;
	
	@Autowired
	public InformationDao informationDao;
	
	@Autowired
	public AboutDao aboutDao;
	
	@Autowired
	public NoticeDao noticeDao;
	
	@Autowired
	public IntroduceDao introduceDao;
	
	@Autowired
	public MessageDao messageDao;
	
	@Autowired
	public DoctorDao doctorDao;
	
	@Autowired
	public PartDao partDao;
	

}
