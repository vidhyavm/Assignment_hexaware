package com.hexaware.hibernateassignment.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="user_details")



@NamedQuery(name="getUserById",query = "select u from User u where u.user_id = :user_id ")
@NamedQuery(name="getAllUser", query ="select u from User u")

public class User {
	
	@Id
	private int user_id;
	@Column(name="user_name")
	private String firstname;
	private String lastname;
	private int mobilenumber;
	private String usertype;
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int user_id, String firstname, String lastname, int mobilenumber, String usertype) {
		super();
		this.user_id = user_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilenumber = mobilenumber;
		this.usertype = usertype;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public String getUsertype() {
		return usertype;
	}


	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}


	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", firstname=" + firstname + ", lastname=" + lastname + ", mobilenumber="
				+ mobilenumber + ", usertype=" + usertype + "]";
	}
	
	

}
