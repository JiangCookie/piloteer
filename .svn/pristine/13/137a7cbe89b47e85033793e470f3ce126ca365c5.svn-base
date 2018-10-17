package com.soft.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.soft.services.E;

@Controller
public class EcarController {
	  @Autowired
	  private E  	e;
	  @RequestMapping("/Ecar")
	   public  String getAllcar(Model map){
		
		  	
		 
		 
		  	
		  	List list=e.getAllcar();
		  	map.addAttribute("list",list);
		 
		  
		   return "E/car";
	   }
}
