package com.soft.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soft.services.E;


@Controller
public class EzcajaxController {
	@Autowired
	private  E  e;
	
	@RequestMapping("/ajaxisname")
   public @ResponseBody String  isName(String  username){
		System.out.println("ÓÃ»§Ãû:"+username);
		boolean  tt=e.isname(username);
		
		System.out.println(tt+"");
	   return  tt+"";
	   
   }
	@RequestMapping("/ajaxistel")
	   public  @ResponseBody  String  istel(String tel){
			System.out.println("tel:"+tel);
		
			boolean tt=e.istel(tel);
			System.out.println(tt+"");
			return tt+"";
	
	   }
		
}
