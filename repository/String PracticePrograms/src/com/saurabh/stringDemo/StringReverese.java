package com.saurabh.stringDemo;

import java.util.Scanner;

/**********************
 * 
 * @author Saurabh Agarwal How to reverse a String in java? Can you write a
 *         program without using any java inbuilt methods?
 *
 */
public class StringReverese {

	static void stringIterate(String s) {
		// converting to char array and reverse iterating
		char[] arr = s.toCharArray();
		int len = arr.length;
		System.out.println(len);
		for (int i = len; i > 0; i--) {
			System.out.print(arr[i - 1]);
		}
		System.out.println();
	}

	static void stringreverse(String s) {
		StringBuffer str = new StringBuffer(s);
		System.out.println(str.reverse());
	}

	public static String recursiveReverse(String s1) {
		if (s1.length() == 1)
			return s1;
		else
			return s1.charAt(s1.length() - 1) + recursiveReverse(s1.substring(0, s1.length() - 1));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter String");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		stringIterate(str);
		stringreverse(str);
		System.out.println(recursiveReverse(str));
		scan.close();
	}

}
