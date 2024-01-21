package com.hexa;

public class StringModi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		System.out.println(s1.hashCode());
		s1.concat(" World");
		System.out.println(s1.hashCode());
		System.out.println(s1);
		s1 = s1.concat(" World");
		System.out.println(s1.hashCode());
		System.out.println(s1);
		s1 = s1 + "again";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1.hashCode());
		sb1.append(" World");
		System.out.println(sb1.hashCode());
		
		String name1 = new String("CBABS");
		String name2 = new String("CBA");
		System.out.println(name1.compareTo(name2));
		

	}

}
