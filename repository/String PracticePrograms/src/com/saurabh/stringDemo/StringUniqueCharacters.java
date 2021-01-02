package com.saurabh.stringDemo;

import java.util.Scanner;

/****************
 * 
 * @author Saurabh Agarwal Write a program to check if String has all unique
 *         characters in java?
 */
public class StringUniqueCharacters {

	static boolean uniqueString(String s) {
		boolean flag = true;
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = false;
					break;
				}
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("Please enter String");
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		boolean flag = uniqueString(str);
		if (flag == true)
			System.out.println("String has Unique characters");
		else
			System.out.println("String doesnot contain unique character");
		scan.close();
	}

}
