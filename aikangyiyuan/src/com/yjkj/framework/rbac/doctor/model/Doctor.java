package com.yjkj.framework.rbac.doctor.model;

import com.yjkj.framework.base.basemodel.BaseModel;
import com.yjkj.framework.rbac.part.model.Part;

public class Doctor extends BaseModel {
	
	private String price;
	private String sex;
	private String age;
	private String type;
	private String part_id;
	private Part part;
	private String url;
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPart_id() {
		return part_id;
	}
	public void setPart_id(String part_id) {
		this.part_id = part_id;
	}
	public Part getPart() {
		return part;
	}
	public void setPart(Part part) {
		this.part = part;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
