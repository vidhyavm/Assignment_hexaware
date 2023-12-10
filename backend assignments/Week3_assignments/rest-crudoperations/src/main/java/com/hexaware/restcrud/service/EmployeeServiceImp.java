package com.hexaware.restcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.restcrud.entity.Employee;
import com.hexaware.restcrud.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {
	
	
	@Autowired
	EmployeeRepository repo;
	

	@Override
	public Employee insertEmployee(Employee employee) {
		
		return repo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {

		
		return repo.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
	
		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long eid) {
	
		return repo.findById(eid).orElse(null);
	}

	@Override
	public void deleteById(Long eid) {
		 
		    repo.deleteById(eid);
		
	}

	@Override
	public Employee getEmployeeByEname(String ename) {
	
		return repo.findByEname(ename);
	}
	@Override
	public Employee getEmployeeBySalary(double salary) {
	
		return repo.findBySalary(salary);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(Long eid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override 
	public Employee getEmployeeBySalary(double salary) {
		return repo.findBySalaryGreaterThan(salary);
	}
	@Override 
	public Employee getEmployeeBySalary(double salary) {
		return repo.findBySalaryLessThan(salary);
	}
	
	
}

