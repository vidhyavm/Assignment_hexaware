package com.hexaware.mappings.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address implements Serializable{
	

	private static final long serialVersionUID = 1L;
@Id
private int addressId;
private String city;
private String State;
private Student student;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public Address(int addressId, String city, String state, Student student) {
	super();
	this.addressId = addressId;
	this.city = city;
	State = state;
	this.student = student;
}

public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}

public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", city=" + city + ", State=" + State + ", student=" + student + "]";
}


}
