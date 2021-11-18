package com.map;

import java.util.Hashtable;
import java.util.Map;

public class MyHashtableUserKeys {

	public static void main(String a[]) {

		Hashtable<Emp, String> tm = new Hashtable<Emp, String>();
		tm.put(new Emp(134, "Ram", 3000), "RAM");
		tm.put(new Emp(235, "John", 6000), "JOHN");
		tm.put(new Emp(876, "Crish", 2000), "CRISH");
		tm.put(new Emp(512, "Tom", 2400), "TOM");
		tm.put(new Emp(512, "Tom", 2400), "TOM");
		for (Map.Entry<Emp, String> entry : tm.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());

		}

		Emp e = new Emp(512, "Tom", 2400);
		System.out.println(e + " ==> " + tm.get(e));

	}
}