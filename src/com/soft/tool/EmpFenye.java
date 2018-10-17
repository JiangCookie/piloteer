package com.soft.tool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soft.dao.ADao;


@Component
public class EmpFenye {	
	@Autowired
	private ADao dao;
	
	//每页几条记录
	int onepage=5;
	
	//总记录数
	int totalrows;
	
	//总页数
	int totalpage;
	//查询的页
	int nowpage;
	//起始记录数
	int startnum;
	//终止记录数
	int endnum;
	

	//计算总记录数
	public  void  gettotalRow(){
		totalrows=dao.getRows();
	}
		
	//计算起始记录数
	public void getStartNum(){
		startnum=(nowpage-1)*onepage;
	}
	//计算终止记录数
	public void getendNum(){
		endnum=nowpage*onepage;
	}
	
	
	//求当前页面数据
	public List getPageData(int page){
		nowpage=page;
		getStartNum();
		getendNum();
		Map map=new HashMap();
		map.put("startnum", startnum);
		map.put("endnum", endnum);
		return dao.getOnePageEmp(map);
	}
	
	
	//计算总页数
	public int gettotalPage(){
		gettotalRow();
		
		if(totalrows/onepage>0){
			totalpage=totalrows/onepage+1;
		}else{
			totalpage=totalrows/onepage;
		}
		return totalpage;
	}
	
	//返回当前页数
	public int  getnowpage(){
		return nowpage;
	}
}























