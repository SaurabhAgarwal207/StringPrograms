package com.saurabh.stringDemo;

import java.util.Scanner;

/**********
 * 
 * @author Saurabh Agarwal
 *  Program for String Length
 */
public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter string");
		Scanner scan = new Scanner(System.in);
		int length = 0;
		String str = scan.next();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			length++;
		}
		System.out.println("Length of String " + str + " is: " + length);
		scan.close();
	}

}
