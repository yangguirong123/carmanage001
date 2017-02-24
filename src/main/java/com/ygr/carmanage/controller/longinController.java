package com.ygr.carmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class longinController {
	@RequestMapping("/login")
	public String longin(){
		
		return "login";//此处返回值是和jsp文件名一致，访问登录界面
		
	}
	@RequestMapping("/main")
	public String main(String userName,String passWord,Model model){
		
		
		if("ygr".equals(userName)&&"123".equals(passWord)){
			return "main";
		}else{
			model.addAttribute("error", "用户名或密码错误！请重新输入>>>");
			return "login";
		}
		
		
	}
}
