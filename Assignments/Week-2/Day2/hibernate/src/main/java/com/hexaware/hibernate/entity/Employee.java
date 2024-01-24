package com.hexaware.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries(
		{
			@NamedQuery(name="geAllEmployees" , query="Select e from Employee e"),
			@NamedQuery(name="getEmployeeByName" , query = "select e from Employee e where e.ename = :name "),
			@NamedQuery(name="getEmployeesBySal", query = "select e from Employee e where e.salary > :sal")
		}
		)
@Entity
public class Employee {
	
	@Id
	private int eid;
	private String ename;
	private double salary;
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

}
