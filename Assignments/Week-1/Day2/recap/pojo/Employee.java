package pojo;

import java.util.Objects;

public class Employee {
	private int eid;
	private String ename;
	private double salary;
	

	public Employee() {
		super();
	}


	public Employee(int eid, String ename, double salary) {
		this(); // refers to default constructor, no need of super() as the default constructor already have it.
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
		
	}
	
	public int getEid() {
		return this.eid;
	}


	@Override
	public int hashCode() {
		return Objects.hash(eid);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid;
	}


	@Override
	public String toString() {
		return eid +"";
	}

}
