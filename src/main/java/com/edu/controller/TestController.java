package com.edu.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author zxq
 * 
 */
@RestController
@EnableAutoConfiguration
public class TestController {

	@RequestMapping("/hello")
	public String hello() {
		return "success";
	}
	
   public static void main(String[] args) {
	   //运行
	SpringApplication.run(TestController.class,args);
}
}
