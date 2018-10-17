package com.soft.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.soft.dao.pojo.Emp;

public interface ADao {
	public abstract List selbrand();
	public abstract List selcartype();
	public abstract List selpricequ();
	public abstract List selage();
	public abstract List selmile();
	public abstract List seloil();
	public abstract List selolistandard();
	public abstract List selseat();
	public abstract List seltypeoil();
	public abstract List selcolor();
	public abstract List selarea();
	public abstract List selcartype1(String id);
	
	public abstract Map selbrandname(String id);
	public abstract Map selcartypename(String id);
	
	
	//∑÷“≥≤È—Ø
	public abstract int getRows();
	public abstract List  getOnePageEmp(Map map);
}
