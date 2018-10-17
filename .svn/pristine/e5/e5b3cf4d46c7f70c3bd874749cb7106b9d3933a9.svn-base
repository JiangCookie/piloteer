package com.soft.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.services.CImp;



@Controller
public class CBycarController {
	@Autowired
	private CImp imp;
	@RequestMapping("cbycar")
	public String dan(){
		return "C/cbycar";
		
	}
	@RequestMapping("allbycar")
	public String getAllbycar(Model map){
		List list=imp.getAllbycar();
		map.addAttribute("list", list);
		return "C/cbycar";
		
	}

}
