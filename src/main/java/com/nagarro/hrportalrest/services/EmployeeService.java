package com.nagarro.hrportalrest.services;

import java.util.List;

import com.nagarro.hrportalrest.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();

	public Employee getEmployee(int empId);

	public void addEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(int empId);

}
