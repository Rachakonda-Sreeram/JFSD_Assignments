package com.hexa;

public class StringDemo extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo d1 = new StringDemo();
		StringDemo d2 =  new StringDemo();
		System.out.println(d1.equals(d2)); // false
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1==str2); // false
		String str3 = "Sreeram";
		String str4 = "Sreeram";
		System.out.println(str3.equals(str4)); // true
		System.out.println(str3==str4); // true
		
	}

}
