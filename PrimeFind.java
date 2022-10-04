package com.ArrayDS;

import java.util.Scanner;

public class PrimeFind {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number :");
		int num=scanner.nextInt();
		boolean flag=false;
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				flag=false;
			}
			else {
				//System.out.println("prime");
			flag=true;
			}
			
		}
		if (flag) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		
		

	}
	public void checkPrime(int n) {
		
	}

}
