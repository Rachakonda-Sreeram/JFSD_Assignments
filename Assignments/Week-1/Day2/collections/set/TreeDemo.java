package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> s = new TreeSet<>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		System.out.println(s);
		
		
		Set <Integer> s1 = new TreeSet<>();
		s1.add(34);
		s1.add(35);
		s1.add(53);
		s1.add(42);
		System.out.println(s1);
	}
	

}
