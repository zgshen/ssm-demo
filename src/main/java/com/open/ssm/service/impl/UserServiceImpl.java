package com.open.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.ssm.dao.UserDao;
import com.open.ssm.model.User;
import com.open.ssm.service.UserService;


@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public User findById(String code,String pwd) {
		User user = userDao.findById(code,pwd);
		return user;
	}

	@Override
	public Integer updateUser(String userName, String userCode) {
		Integer num = userDao.updateUser(userName, userCode);
		return num;
	}

}
