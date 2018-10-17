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
	
	//ÿҳ������¼
	int onepage=5;
	
	//�ܼ�¼��
	int totalrows;
	
	//��ҳ��
	int totalpage;
	//��ѯ��ҳ
	int nowpage;
	//��ʼ��¼��
	int startnum;
	//��ֹ��¼��
	int endnum;
	

	//�����ܼ�¼��
	public  void  gettotalRow(){
		totalrows=dao.getRows();
	}
		
	//������ʼ��¼��
	public void getStartNum(){
		startnum=(nowpage-1)*onepage;
	}
	//������ֹ��¼��
	public void getendNum(){
		endnum=nowpage*onepage;
	}
	
	
	//��ǰҳ������
	public List getPageData(int page){
		nowpage=page;
		getStartNum();
		getendNum();
		Map map=new HashMap();
		map.put("startnum", startnum);
		map.put("endnum", endnum);
		return dao.getOnePageEmp(map);
	}
	
	
	//������ҳ��
	public int gettotalPage(){
		gettotalRow();
		
		if(totalrows/onepage>0){
			totalpage=totalrows/onepage+1;
		}else{
			totalpage=totalrows/onepage;
		}
		return totalpage;
	}
	
	//���ص�ǰҳ��
	public int  getnowpage(){
		return nowpage;
	}
}























