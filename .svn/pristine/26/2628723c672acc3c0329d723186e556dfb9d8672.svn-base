package com.soft.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.dao.pojo.Users;
import com.soft.services.E;





@Controller
public class EzhuceController {
	@Autowired
	  private E  e;
	  @RequestMapping("/Eshowzhuce")
	   public  String show(){
		   
		   return "E/zhuce";
	   }
	  
	  
	  @RequestMapping("/Ezhuce")
	  public String zhuce(Users users){
		  System.out.println("---×¢²á½çÃæ--");
		
		 
			
		boolean tt= e.zhuce(users);
	
		  return   tt?"C/clogin":"E/zhuce";
		
	  }
      
}
