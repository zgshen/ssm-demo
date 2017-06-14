package com.open.ssm.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 *<p>Title: IndexController.java</p>
 *<p>Description: TODO</p>
 *<p>CreateDate: 2017年6月14日</p>
 *@author shen
 *@version v1.0
 */
@Controller
public class IndexController {

	private final static Logger LOG = Logger.getLogger(IndexController.class);
	
	@RequestMapping("ssm")
	public String ssm(Model model){
		LOG.info("---视图测试---");
		model.addAttribute("data", "很抱歉，只做了一点微小的工作。");
		return "ssm";
	}
	
	@RequestMapping("testForm")
	public String testForm(MultipartFile file, HttpServletRequest request) throws IllegalStateException, IOException{
		LOG.info("上传测试......");
		if(file.isEmpty()){
			return "ssm";
		}
		String fname = file.getOriginalFilename();
		LOG.info("文件名："+fname);
		File localFile = new File("D:\\img", UUID.randomUUID()+fname.substring(fname.lastIndexOf(".")));
		if(!localFile.exists()){
			localFile.mkdirs();
		}
		file.transferTo(localFile);
		return "ssm";
	}
	
}
