package com.nagarro.hrportalrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.hrportalrest.dao.EmployeeDao;
import com.nagarro.hrportalrest.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(int empId) {
		if (employeeDao.existsById(empId)) {
			return employeeDao.getById(empId);
		}
		return null;
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeDao.save(employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		if (employeeDao.existsById(empId)) {
			employeeDao.deleteById(empId);
		}
	}

}
