package com.yjkj.framework.rbac.doctor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.base.regular.file.OperaFile;
import com.yjkj.framework.rbac.doctor.model.Doctor;
import com.yjkj.framework.rbac.doctor.service.inte.DoctorService;
@Service("DoctorService")
public class DoctorServiceImpl extends BaseService implements DoctorService {

	
	@Override
	public Pager informationLoad(Pager pager,Doctor Doctor,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("doctor", Doctor);
		List<Doctor> list = this.doctorDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Doctor));
		return pager;
	}
	
	@Override
	public Pager informationLoadFore(Pager pager,Doctor Doctor,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("doctor", Doctor);
		List<Doctor> list = this.doctorDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Doctor));
		return pager;
	}

	@Override
	public List<Doctor> informationLoadAll(Doctor Doctor) throws Exception {
		List<Doctor> list = this.doctorDao.informationLoadAll(Doctor);
		return list;
	}
	

	@Override
	public Integer count(Doctor Doctor) throws Exception {
		Integer count = this.doctorDao.count(Doctor);
		return count;
	}

	@Override
	public Doctor informationLoadOne(Doctor Doctor) throws Exception {
			Doctor = this.doctorDao.informationLoadOne(Doctor);
		return Doctor;
	}

	@Override
	public void informationDelete(Doctor Doctor) throws Exception {
			this.doctorDao.informationDelete(Doctor);

	}

	@Override
	public void informationAdd(Doctor Doctor,MultipartFile[] multipartFiles,HttpServletRequest request) throws Exception {
			Map<String, String> map = OperaFile.uploadFile(multipartFiles, null, request);
			String url = map.get("name");
			Doctor.setUrl(url);
			Doctor.setId(Regular.createId());
			Doctor.setCreatetime(CreatDate.getDate());
			this.doctorDao.informationAdd(Doctor);

	}

	@Override
	public void informationUpade(Doctor Doctor,MultipartFile[] multipartFiles,HttpServletRequest request) throws Exception {
		if(!multipartFiles[0].isEmpty()) {
			Map<String, String> map = OperaFile.uploadFile(multipartFiles, null, request);
			String url = map.get("name");
			Doctor.setUrl(url);
		}
			this.doctorDao.informationUpdate(Doctor);

	}

}
