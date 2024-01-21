package set;
import java.util.HashSet;

import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<>();
		s.add("Ford");
		s.add("Adam");
		s.add("King");
		s.add("Smith");
		s.add("Smith");
		s.add("John");
		
		System.out.println(s);
		
		Set<Integer> s1 = new HashSet<>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		s1.add(6);
		
		System.out.println(s1);
	/*	
		Set<Integer> s2 = new LinkedHashSet<Integer>();
		s2.add(12);
		s2.add(2);
		s2.add(333);
		s2.add(45);
		s2.add(5);
		s2.add(62);
		
		System.out.println(s2); */

	}

}
