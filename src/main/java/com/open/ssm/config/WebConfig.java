package com.open.ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *<p>Title: WebConfig.java</p>
 *<p>Description: 配置类，用于定义DispatcherServlet上下文的bean</p>
 *<p>CreateDate: 2017年6月12日</p>
 *@author shen
 *@version v1.0
 */
@Configuration
@EnableWebMvc
@ComponentScan( "com.open.ssm.controller" )
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	//文件上传，bean必须写name属性且必须为multipartResolver，不然取不到文件对象，别问我为什么，我也唔知
	@Bean(name="multipartResolver")
	protected CommonsMultipartResolver MultipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		//multipartResolver.setUploadTempDir(new FileSystemResource("/tmp"));//可不设置
		multipartResolver.setMaxUploadSize(2097152);//2M
		multipartResolver.setMaxInMemorySize(0);
		multipartResolver.setDefaultEncoding("UTF-8");
		return multipartResolver;
	}
	
   //静态资源的处理
   @Override
   public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
   }
}
