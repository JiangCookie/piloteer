package com.soft.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.services.CImp;

@Controller
public class CloginController {
	@Autowired
	private CImp imp;
	@RequestMapping("clogin")
	public String login(){
		return "C/clogin";
	}
	@RequestMapping("/clogin1")
	public String login1(String username,String password,HttpServletRequest request,ModelMap map){
		System.out.println(username+password);
		System.out.println("====登录====");
		HttpSession session=request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("password", password);
			
		    boolean tt=imp.login1(username, password);
     String url="C/clogin";
     
 	if(tt){
		url="C/guanliyuan";
 		request.getSession().setAttribute("username", username);
 	}else{
 		map.put("mess", "用户名或密码错误");
	}
     
    
	
 	return url;
				
		
		
 	
		
		
	}

}
