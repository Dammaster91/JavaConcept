package com.thread.join;
/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/* Do not add a package declaration */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class Main {
	public static Map<String, Integer> processData(ArrayList<String> array) {
		/*
		 * Modify this method to process `array` as indicated in the question.
		 * At the end, return a Map containing the appropriate values
		 *
		 * Please create appropriate classes, and use appropriate data
		 * structures as necessary.
		 *
		 * Do not print anything in this method.
		 *
		 * Submit this entire program (not just this method) as your answer
		 */
		Map<String, Integer> retVal = new HashMap<String, Integer>();

		Map<String, ArrayList<String>> mapDept = new LinkedHashMap<String, ArrayList<String>>();

		for (String string : array) {

			String[] strArr = string.split(",");
			if (mapDept.containsKey(strArr[2].trim())) {

				ArrayList<String> existVal = mapDept.get(strArr[2].trim());
				existVal.add(string);
				mapDept.put(strArr[2].trim(), existVal);
			} else {

				ArrayList<String> list = new ArrayList<>();
				list.add(string);
				mapDept.put(strArr[2].trim(), list);
			}

		}

		for (Entry<String, ArrayList<String>> entry : mapDept.entrySet()) {
			ArrayList<String> entryVal = entry.getValue();
			Integer in = 0;
			for (String val : entryVal) {
				String[] strChild = val.split(",");

				if (in < Integer.parseInt(strChild[0].trim())) {
					if (retVal.containsKey(strChild[2].trim())) {
						retVal.put(strChild[2].trim(), Integer.parseInt(strChild[3].trim()));
					} else {
						retVal.put(strChild[2].trim(), Integer.parseInt(strChild[3].trim()));
					}
				}
				in = Integer.parseInt(strChild[0].trim());
			}

		}
		return retVal;
	}

	public static void main(String[] args) {
		ArrayList<String> inputData = new ArrayList<String>();
		String line;
		try {
			@SuppressWarnings("resource")
			Scanner in = new Scanner(new BufferedReader(
					new FileReader("G:\\project\\MultiThreading\\src\\com\\thread\\join\\input.txt")));
			while (in.hasNextLine())
				inputData.add(in.nextLine());
			Map<String, Integer> retVal = processData(inputData);
			PrintWriter output = new PrintWriter(new BufferedWriter(
					new FileWriter("G:\\project\\MultiThreading\\src\\com\\thread\\join\\output.txt")));
			for (Map.Entry<String, Integer> e : retVal.entrySet())
				output.println(e.getKey() + ": " + e.getValue());
			output.close();
		} catch (IOException e) {
			System.out.println("IO error in input.txt or output.txt");
		}
	}
}
