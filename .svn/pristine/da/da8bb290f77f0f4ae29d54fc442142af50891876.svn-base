package com.soft.web;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.soft.services.D;
import com.soft.web.vo.Dsell;

@Controller
public class DfreesellController {

	@Autowired
	private D d;

	@RequestMapping("/dfree")
    public String freesell(){
	return "D/freesell";
}	

	@RequestMapping("showtype")
	public String showtype(String cartype,Model map,String month,String brand,String area,String con){
		System.out.println("******");
		List m=d.getbrand();
		List m1=d.getmonth();
		List m2=d.getcartype();
		List m3=d.getarea();
		List m4=d.getcon();
		
		map.addAttribute("cartype", m);
		map.addAttribute("month", m1);
		map.addAttribute("brand", m2);
		map.addAttribute("area", m3);
		map.addAttribute("con", m4);
		
		
		return "D/freesell";
	}
	
	@RequestMapping("showtt")
	public String showtype1(){
		return "D/freesell2";
	}

	@RequestMapping("uploadfile")
	public String upfile(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("===开始上传===");
		
		CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(request.getSession().getServletContext());
		if(multipartResolver.isMultipart(request)){
			System.out.println("有上传文件");
			MultipartHttpServletRequest req=(MultipartHttpServletRequest)request;//强转
			MultipartFile file=req.getFile("myfilename");
			System.out.println(file.getOriginalFilename());
			System.out.println(file.getSize());
			
			//路径
			Date dd=new Date();
			String oldfilename=file.getOriginalFilename();
			String newfilename=dd.getTime()+oldfilename.substring(oldfilename.indexOf("."));
			System.out.println(newfilename);
			File ff=new File("e://piloteer/"+newfilename);
			//File f1=new File(request.getSession().getServletContext().getRealPath("upfile")+"/"+newfilename);
			//存
			file.transferTo(ff);

}
		return "D/freesell";
}}