package com.hexaware.mappings.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	public Department(int departmentID, String departmentName, Set<Employee> employee) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.employee = employee;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + ", employee="
				+ employee + "]";
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	
	public void addEmployee(Employee emp) {
		emp.setDepartment(this);
		Set<Employee> set = getEmployee();
		set.add(emp);
	}
	@Id
	private int departmentID;
	private String departmentName;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
	//@JoinColumn(name = "departmentID")
	private Set<Employee> employee = new HashSet<Employee>();
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
		
	}

}
