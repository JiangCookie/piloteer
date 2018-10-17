package com.soft.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.dao.EDao;
import com.soft.dao.pojo.Users;




@Service
public class EImp implements E{
	@Autowired
    private  EDao dao;

	@Override
	public boolean zhuce(Users users) {
		System.out.println("ÒµÎñ²ã:"+users);
		int i=dao.zhuce(users);
		
		return i>0?true:false;
	}

	@Override
	public boolean isname(String username) {
		return	dao.isName(username)>0?true:false;
	}
	@Override
	public boolean istel(String tel) {
		return	dao.isTel(tel)>0?true:false;
	}

	@Override
	public List getAllcar() {
		return dao.getAllcar();
		
	}
    
}
