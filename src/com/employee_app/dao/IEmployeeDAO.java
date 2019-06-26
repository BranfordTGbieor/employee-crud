package com.employee_app.dao;

import java.util.List;

import com.employee_app.entity.Employee;

public interface IEmployeeDAO {
	
	List<Employee> get();
	
    Employee get(int id);
	
	boolean save(Employee employee);
	
	boolean delete(int id);
	
	boolean update(Employee employee);

}
