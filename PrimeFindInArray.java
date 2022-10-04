package com.ArrayDS;


import java.util.Scanner;

public class PrimeFindInArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter size of array : ");
		int size=scanner.nextInt();
		int arr[]=new int[size];
		//boolean flag=true;
		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(isPrime(arr[i])) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
		}
		
		
		
	}

	static boolean isPrime(int j) {
		int num=j;
		
		for(int i=2;i<num;i++) {
			if(j%i==0) {
				return false;
			}
			
		}
		return true;
		
	}
}
