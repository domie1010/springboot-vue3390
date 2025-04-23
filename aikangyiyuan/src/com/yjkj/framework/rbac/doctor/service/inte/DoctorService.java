package com.yjkj.framework.rbac.doctor.service.inte;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.doctor.model.Doctor;

public interface DoctorService {

	public Pager informationLoad(Pager pager,Doctor Doctor,HttpSession session) throws Exception;
	
	public Pager informationLoadFore(Pager pager,Doctor Doctor,HttpSession session) throws Exception;
	
	public List<Doctor> informationLoadAll(Doctor Doctor) throws Exception;
	
	
	public Integer count(Doctor Doctor) throws Exception;
	
	public Doctor informationLoadOne(Doctor Doctor) throws Exception;
	
	public void informationDelete(Doctor Doctor) throws Exception;
	
	public void informationAdd(Doctor Doctor,MultipartFile[] multipartFile,HttpServletRequest request) throws Exception;
	
	public void informationUpade(Doctor Doctor,MultipartFile[] multipartFile,HttpServletRequest request) throws Exception;
	
}
