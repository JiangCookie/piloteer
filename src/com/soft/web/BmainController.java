package com.soft.web;

import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class BmainController {

	@RequestMapping("main")
	public String show(){
		
		return"B/Bmain";
	}

}
