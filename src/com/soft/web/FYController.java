package com.soft.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.tool.EmpFenye;
import com.soft.web.vo.FenYeVo;

@Controller
public class FYController {
	@Autowired
	private EmpFenye selfy;
	
	@RequestMapping("fenye")
	public  String showfenye(ModelMap map,FenYeVo fy){
		String page1=fy.getPage();
		if(page1==null) page1="1";
		int page=Integer.parseInt(page1);
		
		//获取一页数据
		List list=selfy.getPageData(page);
			
		//计算总页数
		int totalpage=selfy.gettotalPage();
		
		//计算当前页数
		
		map.addAttribute("list", list);
		map.addAttribute("nowpage", page);
		map.addAttribute("totalpage", totalpage);
		return "A/fenye";
	}

}
