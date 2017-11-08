package com.open.ssm.config;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/**
 *<p>Title: SpittrWebAppInitializer.java</p>
 *<p>Description: 应用启动入口和各类配置</p>
 *<p>CreateDate: 2017年6月12日</p>
 *@author shen
 *@version v1.0
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	private final static Logger LOG = Logger.getLogger(WebAppInitializer.class);
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		LOG.info("------root配置类初始化------");
		return new Class<?>[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		LOG.info("------web配置类初始化------");
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		LOG.info("------映射根路径初始化------");
		return new String[]{ "/" };//请求路径映射，根路径
	}
	
}
