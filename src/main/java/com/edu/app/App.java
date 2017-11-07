package com.edu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zxq
 * @version 创建时间：2017年11月7日 下午3:38:58
 */
@ComponentScan(basePackages="com.edu.controller")
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
          SpringApplication.run(App.class,args);
	}
}
