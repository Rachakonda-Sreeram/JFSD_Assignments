package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate da = LocalDate.now();
		LocalDate dat = LocalDate.of(1947, 8, 15);
		System.out.println(da);
		System.out.println(dat);
		String date = "2002-12-14";
		LocalDate birthDate = LocalDate.parse(date);
		System.out.println(birthDate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String s = "12-12-2000";
		LocalDate d1 = LocalDate.parse(s,formatter);
		System.out.println(d1);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		DateTimeFormatter datee = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String full = da.format(datee);
		System.out.println(full);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM / dd / yyyy");
		System.out.println();
	}

}
