package com.switchstatement;

import java.time.LocalDate;

public class DayOfWeek {

	public static void main(String args[]) {

		int year = LocalDate.now().getYear();
		int month = LocalDate.now().getMonthValue();
		int day = LocalDate.now().getDayOfMonth();

		int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();
		switch (dayOfWeek) {
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wedneday");
			break;
		case 4:
			System.out.print("Thurday");
			break;

		case 5:
			System.out.print("Friday");
			break;

		case 6:
			System.out.print("Sarurday");
			break;

		default:
			System.out.print("No Day Found");
			break;
		}
		System.out.print(" " + year + "-" + month + "-" + day);
	}
}