package com.yjkj.framework.rbac.bargain.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.bargain.model.Bargain;
import com.yjkj.framework.rbac.bargain.service.inte.BargainService;
import com.yjkj.framework.rbac.userInfo.model.UserInfo;
@Service("BargainService")
public class BargainServiceImpl extends BaseService implements BargainService {

	
	@Override
	public Pager informationLoad(Pager pager,Bargain bargain,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("bargain", bargain);
		List<Bargain> list = this.bargainDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(bargain));
		return pager;
	}
	
	@Override
	public Pager informationLoadFore(Pager pager,Bargain bargain,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		UserInfo userInfo = (UserInfo) session.getAttribute("User");
		bargain.setUser_id(userInfo.getId());
		map.put("pager", pager);
		map.put("bargain", bargain);
		List<Bargain> list = this.bargainDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(bargain));
		return pager;
	}

	@Override
	public List<Bargain> informationLoadAll() throws Exception {
		List<Bargain> list = this.bargainDao.informationLoadAll();
		return list;
	}
	
	@Override
	public List<Bargain> informationLoadUser(HttpSession session) throws Exception {
		UserInfo userInfo = (UserInfo) session.getAttribute("User");
		Bargain bargain = new Bargain();
		bargain.setUser_id(userInfo.getId());
		List<Bargain> list = this.bargainDao.informationLoadUser(bargain);
		return list;
	}

	@Override
	public Integer count(Bargain bargain) throws Exception {
		Integer count = this.bargainDao.count(bargain);
		return count;
	}

	@Override
	public Bargain informationLoadOne(Bargain bargain) throws Exception {
			bargain = this.bargainDao.informationLoadOne(bargain);
		return bargain;
	}

	@Override
	public void informationDelete(Bargain bargain) throws Exception {
			this.bargainDao.informationDelete(bargain);

	}

	@Override
	public void informationAdd(Bargain bargain) throws Exception {
			bargain.setId(Regular.createId());
			bargain.setCreatetime(CreatDate.getDate());
			this.bargainDao.informationAdd(bargain);

	}

	@Override
	public void informationUpade(Bargain bargain) throws Exception {
			this.bargainDao.informationUpdate(bargain);

	}

}
