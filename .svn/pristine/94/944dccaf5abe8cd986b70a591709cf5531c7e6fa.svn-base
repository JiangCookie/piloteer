package com.soft.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.services.B;

@Controller
public class BindentController {
	@Autowired
	private B b;
	@RequestMapping("indent")
	public String show(Model map){
		List list =b.indent();
		map.addAttribute("list", list);
		return"B/Bindent";
	}

}
