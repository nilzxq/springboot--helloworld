package com.edu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @classDes:功能描述:()
* @author zxq 
* @version date：2017年11月7日 下午7:30:22 
*/
@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index(ModelMap map) {//HttpServletRequest request
		map.addAttribute("name","zxq");
		//Request.setAttribute(arg0,arg1);
		map.put("sex",1);//0 男 1 女 其他
	   List<String> userList=new ArrayList<String>();
	   userList.add("张三");
	   userList.add("李四");
	   userList.add("王五");
	   map.addAttribute("userList",userList);
		return "index";
	}
}
