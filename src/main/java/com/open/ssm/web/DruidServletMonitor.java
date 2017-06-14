package com.open.ssm.web;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;

/**
 *<p>Title: DruidServlMonitor.java</p>
 *<p>Description: Druid Servlet</p>
 *<p>CreateDate: 2017年6月14日</p>
 *@author shen
 *@version v1.0
 */
@WebServlet(name="druidMonitor", urlPatterns="/druid/*", initParams={
		@WebInitParam(name="allow", value="127.0.0.1"),
		@WebInitParam(name="loginUsername", value="admin"),
		@WebInitParam(name="loginPassword", value="123123"),
		@WebInitParam(name="resetEnable", value="false")
})
public class DruidServletMonitor extends StatViewServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
