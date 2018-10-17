package com.soft.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.services.A;
import com.soft.web.vo.select;

@Controller
public class ARetailController {
	@Autowired
	private A a;
	@RequestMapping("sel")
	public String sel(ModelMap map,select sel){
		map.put("sel", sel);
		System.out.println(sel.getBrand());
		System.out.println(sel.getCartype());
		return "redirect:buycar?Brandname=sel.getBrandname()";
	}
}
