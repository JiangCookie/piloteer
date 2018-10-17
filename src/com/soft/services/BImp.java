package com.soft.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.soft.dao.BDao;


@Service
public class BImp implements B{
@Autowired
private BDao dao;
	@Override
	public List collect() {
		
		return dao.collect();
	}
	@Override
	public int Delcol(int id) {
		return dao.Delcol(id);
	}
	@Override
	public List indent() {
		
		return dao.indent();
	}
	@Override
	public List xiadan() {
		
		return dao.xiadan();
	}


}
