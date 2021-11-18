package com.synchronization;

import java.util.Calendar;

public class Display {

	synchronized public  void wish(String name) {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);

		if (hour >= 5 && hour <=12) {
			System.out.println("Good morning! " + name + " Have a nice day");
		} else if (hour >= 13 && hour <= 17) {
			System.out.println("Good afternoon! " + name + " Have a nice day");
		}

		else if (hour >= 18 && hour <= 21) {
			System.out.println("Good evening! " + name + " Have a nice day");
		} else {
			System.out.println("Good night! " + name + " Have a nice day");
		}
	}

}
