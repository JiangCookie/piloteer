package com.soft.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.services.B;
import com.soft.web.vo.BcollectMess;

@Controller
public class BDelcollectController {
	@Autowired
	private B b;
	@RequestMapping("Delcollect")
	public String show(Model map,int id){
		int bb=b.Delcol(id);
		System.out.println("******"+id);
		return "redirect:collect";
		
	}
	

}
