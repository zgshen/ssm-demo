package com.open.ssm.service;

import com.open.ssm.model.User;

/**
 *<p>Title: UserService.java</p>
 *<p>Description: 用户接口</p>
 *<p>CreateDate: 2017年6月11日</p>
 *@author shen
 *@version v1.0
 */
public interface UserService {
	
	User findById(String code,String pwd);
	
	Integer updateUser(String userName, String userCode);
	
}
