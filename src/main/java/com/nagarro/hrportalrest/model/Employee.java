package com.nagarro.hrportalrest.model;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "EMPLOYEES")
@Access(AccessType.FIELD)
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPID", updatable = true, nullable = false)
	private int empId;

	@Column(name = "EMPNAME", nullable = false)
	private String empName;

	@Column(name = "LOCATION", nullable = false)
	private String location;

	@Column(name = "EMAIL", nullable = false)
	private String email;

	@Column(name = "DOB", nullable = false)
	private Date dob;

	public Employee() {
	}

	public Employee(int empId, String empName, String location, String email, Date dob) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.location = location;
		this.email = email;
		this.dob = dob;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getLocation() {
		return location;
	}

	public String getEmail() {
		return email;
	}

	public Date getDob() {
		return dob;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
