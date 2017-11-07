package com.edu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/** 
* @author zxq 
* @version date：2017年11月7日 下午4:44:11 
*/

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody   //拦截返回是json结构
	public Map<String,Object> exceptionHandler(){
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("code","500");
		result.put("msg","亲，系统错误，请稍后重试~~~~");
		return result;
	}
}
