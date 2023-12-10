package com.hexaware.restcrud.service;


import java.util.List;

import com.hexaware.restcrud.entity.Employee;

public interface IEmployeeService {
	
	
	public Employee  insertEmployee(Employee employee);
	public Employee  updateEmployee(Employee employee);
	
	public void   deleteEmployeeById(Long eid);
	
	
	public List<Employee> getAllEmployee();
	
	Employee getEmployeeById(Long eid);
	Employee getEmployeeBySalary(double salary);
	
	public Employee getEmployeeByEname(String ename);
	
	public List<Employee> getEmployeeBySalaryGT(double salary);
	
	public List <Employee> getEmployeeBySalaryLT(double salary);
	
	

}
