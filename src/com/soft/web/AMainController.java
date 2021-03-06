package com.soft.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.services.A;
import com.soft.web.vo.select;

@Controller
public class AMainController {
	@Autowired
	private A a;
	@RequestMapping("showMain")
	public String showMian(){
		return "A/FirstIndex";
	}
	
	@RequestMapping("buycar")
	public String showbuycar(ModelMap map,select sel){
		List brand=a.selbrand();
		List listname=new ArrayList();   //当前筛选提示数组
		//点击品牌	
		if(sel.getBrand()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//选择提示		
			map.addAttribute("brandid", sel.getBrand());
					
			//筛选提示			
			listname.add(sel.getBrand());
			
		}else{
			List cartype=a.selcartype();
			map.addAttribute("cartype", cartype);
		}	
		
		//点击车系
		if(sel.getCartype()!=""&&sel.getCartype()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//返回参数
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
						
			//筛选提示
			listname.add(sel.getCartype());		
		}		
		//点击价格区间
		if(sel.getPricequ()!=""&&sel.getPricequ()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//返回参数
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());
			
			//筛选提示
			listname.add(sel.getPricequ());			
		}	
		
		//车龄
		if(sel.getAgeo()!=""&&sel.getAgeo()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//返回参数
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//筛选提示
			listname.add(sel.getAgeo());			
		}
		
		//里程
		if(sel.getMile()!=""&&sel.getMile()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//返回参数
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//筛选提示
			listname.add(sel.getMile());			
		}

		//排量
		if(sel.getOil()!=""&&sel.getOil()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//返回参数
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//筛选提示
			listname.add(sel.getOil());			
		}
		
		//排放标准
		if(sel.getOlistandard()!=""&&sel.getOlistandard()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//返回参数
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//筛选提示
			listname.add(sel.getOlistandard());			
		}
		
		//座位数
		if(sel.getSeat()!=""&&sel.getSeat()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//返回参数
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//筛选提示
			listname.add(sel.getSeat());			
		}
		
		//燃油类型
		if(sel.getTypeoil()!=""&&sel.getTypeoil()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//返回参数
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//筛选提示
			listname.add(sel.getTypeoil());			
		}
		
		//颜色
		if(sel.getColor()!=""&&sel.getColor()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//返回参数
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());
			System.out.println(sel.getPricequ());
			//筛选提示
			listname.add(sel.getColor());			
		}
		
		//车牌所在地
		if(sel.getArea()!=""&&sel.getArea()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//返回参数
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//筛选提示
			listname.add(sel.getArea());			
		}
		
		
	
		//增加筛选
		map.addAttribute("listname",listname);
		
		List pricequ=a.selpricequ();
		List age=a.selage();
		List mile=a.selmile();
		List oil=a.seloil();
		List olistandard=a.selolistandard();
		List seat=a.selseat();
		List typeoil=a.seltypeoil();
		List color=a.selcolor();
		List area=a.selarea();
		
		
		map.addAttribute("brand", brand);
		map.addAttribute("pricequ", pricequ);
		map.addAttribute("age", age);
		map.addAttribute("mile", mile);
		map.addAttribute("oil", oil);
		map.addAttribute("olistandard", olistandard);
		map.addAttribute("seat", seat);
		map.addAttribute("typeoil", typeoil);
		map.addAttribute("color", color);
		map.addAttribute("area", area);
		
		
		
		
		return "A/BuyIndex";
	}
}
