package com.yjkj.framework.rbac.bargain.model;

import com.yjkj.framework.base.basemodel.BaseModel;
import com.yjkj.framework.rbac.doctor.model.Doctor;
import com.yjkj.framework.rbac.userInfo.model.UserInfo;

public class Bargain extends BaseModel {
	
	private String doctor_id;
	private String user_id;
	private Doctor doctor;
	private UserInfo userInfo;
	public String getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	
	
}
