package com.open.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.open.ssm.model.User;
import com.open.ssm.service.UserService;

/**
 *<p>Title: MainController.java</p>
 *<p>Description: TODO</p>
 *<p>CreateDate: 2017年6月12日</p>
 *@author shen
 *@version v1.0
 */
@RestController
public class MainController {

	private final static Logger LOG = Logger.getLogger(MainController.class);
	
	/*
	//使用JdbcTemplate的方式
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@RequestMapping("/index")
	public String index(){
		String sql = "select * from blog_user";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		LOG.info(list);
		
		String ssql = "select * from blog_user where user_code=:user_code";
		Map<String, Object> params = new HashMap<>();
		params.put("user_code", "admin");
		List<Map<String, Object>> pList = namedParameterJdbcTemplate.queryForList(ssql, params);
		LOG.info(pList);
		
		return "Welcome to ssm-demo...";
	}*/
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/main")
	public String main(){
		User user = userService.findById("admin", "2ff4d63f4adb19d17cc0a99d2532b6a1");
		LOG.info(user);
		System.out.println(user.toString());
		return "Welcome to ssm-demo...";
	}
	
	@RequestMapping("/update")
	public String updateTest(){
		Integer num = userService.updateUser("test", "admin");
		LOG.info("return result: "+num);
		return "update operation test...";
	}
	
	
}
