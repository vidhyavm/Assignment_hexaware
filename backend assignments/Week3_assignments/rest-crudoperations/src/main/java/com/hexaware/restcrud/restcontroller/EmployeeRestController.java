package com.hexaware.restcrud.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.restcrud.entity.Employee;
import com.hexaware.restcrud.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;

	@GetMapping("/get/{eid}")
	public Employee getById(@PathVariable Long eid) {

		return service.getEmployeeById(eid);

	}

	@GetMapping("/getbyename/{ename}")
	public Employee getByEname(@PathVariable String ename) {
		
		return service.getEmployeeByEname(ename);
		
	}
		
	
		@GetMapping("/getbysalary/{salary}")
		public Employee   getBySalary(@PathVariable double salary) {
			
			return service.getEmployeeBySalary(salary);
			
		}
		@GetMapping("/get/salary/{salarygt}")
	public List<Employee> getBySalaryGT(@PathVariable double salary){
		return service.getEmployeeBySalaryGT(salary);
	}
		@GetMapping("/get/salary/{salarylt}")
		public List<Employee> getBySalaryLT(@PathVariable double salary){
			return service.getEmployeeBySalaryLT(salary);
		}
		
	
	
	@DeleteMapping("/delete/{eid}")
	public String deleteById(@PathVariable Long eid) {

		service.deleteEmployeeById(eid); // returns void

		return "Record Deleted";

	}

	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public Employee addEmployee(@RequestBody Employee employee) {

		return service.insertEmployee(employee);

	}

	@GetMapping(value = "/getall", produces = "application/json")
	public List<Employee> getAll() {

		return service.getAllEmployee();

	}

	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public Employee updateEmployee(@RequestBody Employee employee) {

		return service.updateEmployee(employee);

	}

}
