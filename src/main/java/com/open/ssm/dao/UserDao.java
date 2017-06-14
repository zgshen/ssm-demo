package com.open.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.open.ssm.model.User;

public interface UserDao {
	
	User findById(@Param("userCode") String code,@Param("userPwd") String pwd);
	
	Integer updateUser(String userName, String userCode);
}
