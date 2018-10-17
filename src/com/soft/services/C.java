package com.soft.services;

import java.util.List;
import java.util.Map;

import com.soft.dao.pojo.Emp;

public interface C {
	public boolean login1(String username,String password);

	public List getAllbycar();

	public Emp getOnebycar(String id);
}
