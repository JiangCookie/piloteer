package com.soft.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.dao.ADao;
import com.soft.dao.DDao;

import com.soft.dao.pojo.Emp;

@Service
public class DImp implements D{

	@Autowired
	private DDao dao;
	@Override
	public List getbrand() {
		List list=dao.getbrand();
		return list;
		
	}
	@Override
	public List getmonth() {
		List list= dao.getmonth();
		return list;
	}
	@Override
	public List getcartype() {
		List list=dao.getcartype();
		return list;
	}
	@Override
	public List getarea() {
		List list=dao.getarea();
		return list;
	}
	@Override
	public List getcon() {
		List list=dao.getcon();
		return list;
	}
	

	
    
}
