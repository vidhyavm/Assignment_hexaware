package com.hexaware.springboot1.entities;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private int uid;
	private String uname;
	private String utype;
	private double reg_amount;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String uname, String utype, double reg_amount) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.utype = utype;
		this.reg_amount = reg_amount;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	public double getReg_amount() {
		return reg_amount;
	}
	public void setReg_amount(double reg_amount) {
		this.reg_amount = reg_amount;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", utype=" + utype + ", reg_amount=" + reg_amount + "]";
	}
	
	

}
