package com.hexaware.restcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.restcrud.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
	
	
				public Employee   findByEname(String ename); // select * from Employee_Details where ename =?;
				
				public Employee  findBySalary(double salary);

				public List <Employee> findBySalaryGreaterThan(double input);
				
				public List<Employee> findBySalaryLessThan(double input);
				
				
				@Query("select e from Employee e where e.salary= ")
				public List<Employee> getEmployeeSorted(double salary);
				
				public List<Employee> getSorted();
}
