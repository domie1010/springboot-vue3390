package com.yjkj.framework.rbac.doctor.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.doctor.model.Doctor;

public interface DoctorDao {

	public List<Doctor> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Doctor> informationLoadAll(Doctor Doctor) throws Exception;
	
	public List<Doctor> informationLoadUser(Doctor Doctor) throws Exception;
	
	public Integer count(Doctor Doctor) throws Exception;
	
	public Doctor informationLoadOne(Doctor Doctor) throws Exception;
	
	public void informationDelete(Doctor Doctor) throws Exception;
	
	public void informationAdd(Doctor Doctor) throws Exception;
	
	public void informationUpdate(Doctor Doctor) throws Exception;
	
}
