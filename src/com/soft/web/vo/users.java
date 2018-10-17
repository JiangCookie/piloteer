package com.soft.web.vo;

import org.hibernate.validator.constraints.NotEmpty;

public class users {

	private String username;

	private String password;
	private double tel;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getTel() {
		return tel;
	}
	public void setTel(double tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "users [username=" + username + ", password=" + password + ", tel=" + tel + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getTel()=" + getTel() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
