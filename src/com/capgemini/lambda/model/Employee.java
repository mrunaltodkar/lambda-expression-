package com.capgemini.lambda.model;

import java.util.Objects;

public class Employee {

	private String employeeName;
	private int employeeId;
	private String employeeDepartment;
	private double employeeSalary;

	public Employee() {
		super();

	}

	public Employee(int employeeId, String employeeName, String employeeDepartment, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeDepartment = employeeDepartment;
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ",  employeeDepartment="
				+ employeeDepartment + ", employeeSalary=" + employeeSalary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee employee = (Employee) obj;
		if (employeeId != employee.employeeId)
			return false;
		if (employeeName == null) {
			if (employee.employeeName != null)
				return false;
		} else if (!employeeName.equals(employee.employeeName))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName);
	}
}
