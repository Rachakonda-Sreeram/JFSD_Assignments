package com.hexaware.springannotations.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

// @Component -- entity/pojo
// @Service
// @Repository
// @Scope("Singleton")
@Scope("prototype")
@Controller("emp1")
public class Employee {
	
	private int eid;
	private String ename;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
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

}
