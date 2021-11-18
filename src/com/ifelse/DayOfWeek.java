package com.ifelse;

import java.time.LocalDate;

public class DayOfWeek {

	public static void main(String args[]) {

		int year = LocalDate.now().getYear();
		int month = LocalDate.now().getMonthValue();
		int day = LocalDate.now().getDayOfMonth();

		int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();

		if (dayOfWeek == 0) {
			System.out.print("Sunday");
		} else if (dayOfWeek == 1) {
			System.out.print("Monday");
		} else if (dayOfWeek == 2) {
			System.out.print("Tuesday");
		} else if (dayOfWeek == 3) {
			System.out.print("Wedneday");
		} else if (dayOfWeek == 4) {
			System.out.print("Thurday");
		} else if (dayOfWeek == 5) {
			System.out.print("Friday");
		} else
			System.out.print("Sarurday");
		System.out.print(" " + year + "-" + month + "-" + day);
	}
}