package entity;

import java.util.Objects;

public class Dept {
	private int dno;
	private String dname;
	private String location;
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Dept [dno=" + dno + ", dname=" + dname + ", location=" + location + "]";
	}
	public Dept() {
		super();
	}
	public Dept(int dno, String dname, String location) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.location = location;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dname, dno, location);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dept other = (Dept) obj;
		return Objects.equals(dname, other.dname) && dno == other.dno && Objects.equals(location, other.location);
	}

}