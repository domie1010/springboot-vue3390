package com.yjkj.framework.rbac.message.model;

import com.yjkj.framework.base.basemodel.BaseModel;
import com.yjkj.framework.rbac.bargain.model.Bargain;
import com.yjkj.framework.rbac.userInfo.model.UserInfo;

public class Message extends BaseModel{
	
	private String user_id;
	private String reply_id;
	private String bargain_id;
	private String message;
	private String reply_message;
	private String point;
	private UserInfo userInfo;
	private UserInfo reply;
	private Bargain bargain;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getReply_id() {
		return reply_id;
	}
	public void setReply_id(String reply_id) {
		this.reply_id = reply_id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getReply_message() {
		return reply_message;
	}
	public void setReply_message(String reply_message) {
		this.reply_message = reply_message;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public UserInfo getReply() {
		return reply;
	}
	public void setReply(UserInfo reply) {
		this.reply = reply;
	}
	public String getBargain_id() {
		return bargain_id;
	}
	public void setBargain_id(String bargain_id) {
		this.bargain_id = bargain_id;
	}
	public Bargain getBargain() {
		return bargain;
	}
	public void setBargain(Bargain bargain) {
		this.bargain = bargain;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	
	
}
