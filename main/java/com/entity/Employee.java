package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	@Column(nullable = false)
	private String employeeName;
	
	private double employeeSalary;
	
	private String employeeDepartment;
	
	@Column(unique = true)
	private String employeeEmail;
	
	@Column(nullable = false)
	private int employeeAge;
	
	public Employee() {
		
	}

	public Employee(int employeeId, String employeeName, double employeeSalary, String employeeDepartment,
			String employeeEmail, int employeeAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeDepartment = employeeDepartment;
		this.employeeEmail = employeeEmail;
		this.employeeAge = employeeAge;
	}

	public Employee(String employeeName, double employeeSalary, String employeeDepartment, String employeeEmail,
			int employeeAge) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeDepartment = employeeDepartment;
		this.employeeEmail = employeeEmail;
		this.employeeAge = employeeAge;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeDepartment=" + employeeDepartment + ", employeeEmail=" + employeeEmail
				+ ", employeeAge=" + employeeAge + "]";
	}
	

}
