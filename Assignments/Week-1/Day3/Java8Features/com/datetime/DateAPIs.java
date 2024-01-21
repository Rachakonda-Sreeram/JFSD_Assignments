package com.datetime;

import java.time.LocalDate;

public class DateAPIs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate da = LocalDate.now();
		LocalDate dat = LocalDate.of(2024, 1, 17);
		System.out.println(da);
		System.out.println(da.isLeapYear());
		System.out.println(da.isBefore(dat));
		System.out.println(da.plusMonths(20));
		System.out.println(da.minusYears(10));
		System.out.println(da.withYear(2022));
		System.out.println(dat.getYear());
		System.out.println(dat.getDayOfWeek());

	}

}
