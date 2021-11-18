package com.map;

import java.util.Hashtable;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<String, Integer> prices = new Hashtable<String, Integer>();
		// add key-value pair to Hashtable
		prices.put("Apple", 50);
		prices.put("Orange", 20);
		prices.put("Banana", 10);
		prices.put("Grapes", 40);
		prices.put("Papaya", 50);
        //Using Lambda Expression
		prices.forEach((k, v) -> System.out.println("Fruit: " + k + ", Price: " + v));

		System.out.println(prices);
		 //Using Key Set
		Set<String> keys = prices.keySet();
		for (String key : keys) {
			System.out.println("Fruit  " + key + " price is: " + prices.get(key));
		}
	}

}
