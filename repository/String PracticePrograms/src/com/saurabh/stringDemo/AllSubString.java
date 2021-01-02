package com.saurabh.stringDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/************
 * 
 * 
 * @author Saurabh Agarwal
 *Find all substrings of String in java
 */
public class AllSubString {
	
	static void uniqueSubString(String str)
	{
		System.out.println("Unique Values are: ");
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<str.length();i++)
		{
			for (int j=i+1;j<=str.length();j++)
			{
				hs.add(str.substring(i, j));
			}
		}
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter String");
		str=scan.next();
		System.out.println("With repetitions substrings are");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i, j));
			}
		}
		uniqueSubString(str);
		scan.close();
	}

}
