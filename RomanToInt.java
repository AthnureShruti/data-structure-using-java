package com.ArrayDS;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class RomanToInt {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		System.out.println(romanToDecimal(string));

	}
	public static int values(char ch) {
		if(ch=='I') {
			return 1;
		}
		if(ch=='V') {
			return 5;
		}
		if(ch=='X') {
			return 10;
		}
		if(ch=='L') {
			return 50;
		}
		if(ch=='C') {
			return 100;
		}
		if(ch=='D') {
			return 500;
		}
		if(ch=='M') {
			return 1000;
		}
		return -1;
	}

	private static int romanToDecimal(String string) {
		int res=0;
		for(int i=0;i<string.length();i++) {
			int s1=values(string.charAt(i));
			if(i+1<string.length()) {
				int s2=values(string.charAt(i+1));
				
				if(s1>=s2) {
					res=res+s1;
				}
				else {
					res=res+s2-s1;
				}
			}
			else {
				res=res+s1;
			}
			
		}
		return res;
	}

}
