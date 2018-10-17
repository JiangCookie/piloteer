package com.soft.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.services.CImp;
@Controller
public class Clogin1Controller {
	@Autowired
	private CImp imp;
	@RequestMapping("clogin0")
	public String login(){
		return "C/clogin1";
	}
	@RequestMapping("/clogin2")
	public String login1(String username,String password,HttpServletRequest request,ModelMap map){
		System.out.println(username+password);
		System.out.println("====��¼====");
		HttpSession session=request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("password", password);
			
		    boolean tt=imp.login1(username, password);
     String url="C/clogin1";
     
 	if(tt){
		url="C/shouye";
 		request.getSession().setAttribute("username", username);
 	}else{
 		map.put("mess", "�û������������!");
	}
     
    
	
 	return url;
				
		
		
 	
		
}
}
