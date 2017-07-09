package com.open.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.open.ssm.dao.UserDao;
import com.open.ssm.model.User;
import com.open.ssm.service.UserService;


@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public User findById(String code,String pwd) {
		//User user = userDao.findById(code,pwd);
	    
	    List<User> list = userDao.selectList(
	            new EntityWrapper<User>().eq("user_code", code).eq("user_pwd", pwd) 
	    );
	    System.out.println(list);
	    
	    User user = new User();
        user.setUserId(1);
        user = userDao.selectById(user.getUserId());
	    
		return user;
	}

	@Override
	public Integer updateUser(String userName, String userCode) {
		//Integer num = userDao.updateUser(userName, userCode);
		//return num;
	    return null;
	}

}
