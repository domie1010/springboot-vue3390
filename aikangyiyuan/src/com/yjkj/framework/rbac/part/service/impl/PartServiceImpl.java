package com.yjkj.framework.rbac.part.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.part.model.Part;
import com.yjkj.framework.rbac.part.service.inte.PartService;
@Service("PartService")
public class PartServiceImpl extends BaseService implements PartService {

	
	@Override
	public Pager informationLoad(Pager pager,Part Part,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("part", Part);
		List<Part> list = this.partDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Part));
		return pager;
	}
	
	@Override
	public Pager informationLoadFore(Pager pager,Part Part,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("part", Part);
		List<Part> list = this.partDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Part));
		return pager;
	}

	@Override
	public List<Part> informationLoadAll(Part Part) throws Exception {
		List<Part> list = this.partDao.informationLoadAll(Part);
		return list;
	}
	
	@Override
	public Integer count(Part Part) throws Exception {
		Integer count = this.partDao.count(Part);
		return count;
	}

	@Override
	public Part informationLoadOne(Part Part) throws Exception {
			Part = this.partDao.informationLoadOne(Part);
		return Part;
	}

	@Override
	public void informationDelete(Part Part) throws Exception {
			this.partDao.informationDelete(Part);

	}

	@Override
	public void informationAdd(Part Part) throws Exception {
			Part.setId(Regular.createId());
			Part.setCreatetime(CreatDate.getDate());
			this.partDao.informationAdd(Part);

	}

	@Override
	public void informationUpade(Part Part) throws Exception {
			this.partDao.informationUpdate(Part);

	}

}
