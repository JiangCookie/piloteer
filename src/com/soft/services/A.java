package com.soft.services;

import java.util.List;
import java.util.Map;

public interface A {

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
	
	
	public abstract Map selbrandname(String id);   //品牌名
	public abstract Map selcartypename(String id); //车系名
}
