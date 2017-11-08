package com.open.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.mysql.fabric.xmlrpc.base.Array;
import com.open.ssm.dao.UserDao;
import com.open.ssm.model.User;
import com.open.ssm.service.UserService;


@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	
    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    
	@Autowired
	private UserDao userDao;

	@Override
	public User findById(String code,String pwd) {
		//User user = userDao.findById(code,pwd);//普通方式
	    
	    List<User> list = userDao.selectList(
	            new EntityWrapper<User>().eq("user_code", code).eq("user_pwd", pwd)//Mybatis-plus封装方法 
	    );
	    /*测试readonly事务
	    logger.info(list.toString());
	    
	    User user = new User();
        user.setUserId(1);
        user = userDao.selectById(user.getUserId());
        
        Integer num = userDao.updateUser("---", "admin");
        logger.info(num.toString());*/
	    if (list.size()>0) {
	        return list.get(0);
	    } else {
	        //return user;
	        return null;
	    }
	}

	@Override
	public Integer updateUser(String userName, String userCode) {
		Integer num = userDao.updateUser(userName, userCode);
		return num;
	}

}
