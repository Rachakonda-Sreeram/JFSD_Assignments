package pojo;

import java.util.HashSet;
import java.util.Set;

public class EmpTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee(101,"King",8000));
		set.add(new Employee(101,"Smith",9000));
		System.out.println(set);
		
		

	}

}
