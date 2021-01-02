package com.saurabh.stringDemo;

import java.util.Arrays;
import java.util.Scanner;

/********************
 * 
 * @author Saurabh Agarwal
 *Write a java program to check if two Strings are anagram in java?
 */
public class StringAnagram {

	static boolean stringCheck(String s1, String s2) {
		boolean flag = true;
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {
						flag = true;
						;
					}
				}
			}
		} else {
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {

		String str1, str2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first string");
		str1 = scan.next();
		System.out.println("Please enter second string");
		str2 = scan.next();
		boolean flag = stringCheck(str1, str2);
		if (flag == true)
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings are not Anagram");
		scan.close();
	}

}
