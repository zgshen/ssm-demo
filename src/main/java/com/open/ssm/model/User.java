package com.open.ssm.model;

import java.util.Date;

public class User {
	private String userCode;
	private String userName;
	private String userPwd;
	private String email;
	private String address;
	private Date userBorn;
	private Date inDate;
	private Date outDate;
	
	
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getUserBorn() {
		return userBorn;
	}
	public void setUserBorn(Date userBorn) {
		this.userBorn = userBorn;
	}
	public Date getInDate() {
		return inDate;
	}
	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}
	public Date getOutDate() {
		return outDate;
	}
	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}
	@Override
	public String toString() {
		return "User [userCode=" + userCode + ", userName=" + userName + ", userPwd=" + userPwd + ", email=" + email
				+ ", address=" + address + ", userBorn=" + userBorn + ", inDate=" + inDate + ", outDate=" + outDate
				+ "]";
	}
	
	
}
