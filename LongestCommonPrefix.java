package com.ArrayDS;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] strings= {"geeksforgeeks", "geeks", "geek", "geezer"};
		System.out.println(findLongestCommonPre(strings));
	}

	private static String findLongestCommonPre(String[] a) {
		int size=a.length;
		 if (size == 0)
	            return "";
	 
	        if (size == 1)
	            return a[0];
	 
	        
	        Arrays.sort(a);
	        
	        int end = Math.min(a[0].length(), a[size-1].length());
	        
	       
	        int i = 0;
	        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
	            i++;
	 
	        String pre = a[0].substring(0, i);
	        return pre;
	}

}
