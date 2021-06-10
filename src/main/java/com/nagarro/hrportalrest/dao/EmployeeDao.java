package com.nagarro.hrportalrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.hrportalrest.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
