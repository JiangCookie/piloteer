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
		
		//��ȡһҳ����
		List list=selfy.getPageData(page);
			
		//������ҳ��
		int totalpage=selfy.gettotalPage();
		
		//���㵱ǰҳ��
		
		map.addAttribute("list", list);
		map.addAttribute("nowpage", page);
		map.addAttribute("totalpage", totalpage);
		return "A/fenye";
	}

}
