package com.saurabh.stringDemo;

import java.util.HashMap;
import java.util.Scanner;

/************
 * 
 * @author Saurabh Agarwal
 *Java Program to find duplicate Characters in a String
 */
public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter String");
		str = scan.next();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}

		}
		for (Character c : hm.keySet()) {
			if (hm.get(c) > 1)
				System.out.println(c + "   " + hm.put(c, hm.get(c)));
		}
		scan.close();
	}

}
