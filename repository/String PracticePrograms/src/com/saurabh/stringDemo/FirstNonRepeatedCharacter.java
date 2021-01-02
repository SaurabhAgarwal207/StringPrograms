package com.saurabh.stringDemo;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str;
		System.out.println("Please enter string");
		str = scan.next();
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		for (Entry<Character, Integer> e : hm.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println("First non repeated character in string : " + str + " is : " + e.getKey());
				break;
			}
		}
		scan.close();
	}

}
