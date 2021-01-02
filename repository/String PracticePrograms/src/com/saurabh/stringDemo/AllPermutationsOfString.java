package com.saurabh.stringDemo;

import java.util.Scanner;

public class AllPermutationsOfString {

	static String swapstring(String a, int i, int j) {
		char[] b = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}

	static void generatePermutations(String str, int start, int end) {
		if (start == end - 1)
			System.out.println(str);
		else {
			for (int i = start; i < end; i++) {
				str = swapstring(str, start, i);
				generatePermutations(str, start + 1, end);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter String:");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int len = str.length();
		System.out.println("All possible permutations are: ");
		generatePermutations(str, 0, len);
		scan.close();
	}
}
