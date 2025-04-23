package com.yjkj.framework.rbac.information.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.information.model.Information;
import com.yjkj.framework.rbac.information.service.inte.InformationService;
@Service("InformationService")
public class InformationServiceImpl extends BaseService implements InformationService {

	
	@Override
	public Pager informationLoad(Pager pager,Information Information,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("information", Information);
		List<Information> list = this.informationDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Information));
		return pager;
	}

	@Override
	public List<Information> informationLoadAll() throws Exception {
		List<Information> list = this.informationDao.informationLoadAll();
		return list;
	}
	

	@Override
	public Integer count(Information Information) throws Exception {
		Integer count = this.informationDao.count(Information);
		return count;
	}

	@Override
	public Information informationLoadOne(Information Information) throws Exception {
			Information = this.informationDao.informationLoadOne(Information);
		return Information;
	}

	@Override
	public void informationDelete(Information Information) throws Exception {
			this.informationDao.informationDelete(Information);

	}

	@Override
	public void informationAdd(Information Information) throws Exception {
			Information.setId(Regular.createId());
			Information.setCreatetime(CreatDate.getDate());
			this.informationDao.informationAdd(Information);

	}

	@Override
	public void informationUpade(Information Information) throws Exception {
			this.informationDao.informationUpdate(Information);

	}

}
