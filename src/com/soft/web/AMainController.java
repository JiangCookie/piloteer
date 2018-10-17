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
		List listname=new ArrayList();   //��ǰɸѡ��ʾ����
		//���Ʒ��	
		if(sel.getBrand()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//ѡ����ʾ		
			map.addAttribute("brandid", sel.getBrand());
					
			//ɸѡ��ʾ			
			listname.add(sel.getBrand());
			
		}else{
			List cartype=a.selcartype();
			map.addAttribute("cartype", cartype);
		}	
		
		//�����ϵ
		if(sel.getCartype()!=""&&sel.getCartype()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//���ز���
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
						
			//ɸѡ��ʾ
			listname.add(sel.getCartype());		
		}		
		//����۸�����
		if(sel.getPricequ()!=""&&sel.getPricequ()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//���ز���
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());
			
			//ɸѡ��ʾ
			listname.add(sel.getPricequ());			
		}	
		
		//����
		if(sel.getAgeo()!=""&&sel.getAgeo()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//���ز���
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//ɸѡ��ʾ
			listname.add(sel.getAgeo());			
		}
		
		//���
		if(sel.getMile()!=""&&sel.getMile()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//���ز���
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//ɸѡ��ʾ
			listname.add(sel.getMile());			
		}

		//����
		if(sel.getOil()!=""&&sel.getOil()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//���ز���
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//ɸѡ��ʾ
			listname.add(sel.getOil());			
		}
		
		//�ŷű�׼
		if(sel.getOlistandard()!=""&&sel.getOlistandard()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//���ز���
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//ɸѡ��ʾ
			listname.add(sel.getOlistandard());			
		}
		
		//��λ��
		if(sel.getSeat()!=""&&sel.getSeat()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//���ز���
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//ɸѡ��ʾ
			listname.add(sel.getSeat());			
		}
		
		//ȼ������
		if(sel.getTypeoil()!=""&&sel.getTypeoil()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//���ز���
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//ɸѡ��ʾ
			listname.add(sel.getTypeoil());			
		}
		
		//��ɫ
		if(sel.getColor()!=""&&sel.getColor()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//���ز���
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());
			System.out.println(sel.getPricequ());
			//ɸѡ��ʾ
			listname.add(sel.getColor());			
		}
		
		//�������ڵ�
		if(sel.getArea()!=""&&sel.getArea()!=null){
			List cartype=a.selcartype1(sel.getBrand());
			map.addAttribute("cartype", cartype);
			
			//���ز���
			map.addAttribute("brandid", sel.getBrand());
			map.addAttribute("cartypeid", sel.getCartype());
			map.addAttribute("pricequid", sel.getPricequ());

			//ɸѡ��ʾ
			listname.add(sel.getArea());			
		}
		
		
	
		//����ɸѡ
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