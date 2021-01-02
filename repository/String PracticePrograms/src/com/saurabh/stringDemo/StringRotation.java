package com.saurabh.stringDemo;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		System.out.println("Please enter Main String");
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		System.out.println("Please enter second string to be checked");
		String str2 = scan.next();
		String str3 = str + str;
		boolean flag = str3.contains(str2);
		if (flag == true)
			System.out.println(str2 + " is in rotation of " + str);
		else
			System.out.println("Not rotation");
		scan.close();
	}

}
