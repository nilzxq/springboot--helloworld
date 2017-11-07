package com.edu.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* @author 作者 zxq
* @version 创建时间：2017年11月7日 下午3:29:02 
* 
*/

@RestController
@EnableAutoConfiguration
public class HelloController {

	@RequestMapping("/hello1")
	public String hello1() {
		return "hello";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloController.class,args);
	}
}
