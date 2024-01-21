package com.datatypes;

public class DatatypeDemo {

	public static void main(String[] args) {
		
		byte smallValue = 23;
		short mediumValue = 2323;
		int length = 100;
		long phoneNumber = 444555666;
		float amount = 103.54f;
		double balance = 765.43;
		char firstLetter = 'S';
		boolean isValid = true;
		byte b = (byte)130;
		double d  = 9999999.9191;
		float f = 567.89f;
		
		System.out.println("Byte: " +smallValue+ " Short: " + mediumValue +" Integer: " +length+ " Long: " +phoneNumber
				+ " Float: " + amount+ " Double: " +balance+ " Character: "+firstLetter+" Boolean: "+isValid);
		
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);
		f = (float) d;
		System.out.println(f);

	}

}
