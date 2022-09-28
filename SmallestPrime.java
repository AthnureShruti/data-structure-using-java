package com.ArrayDS;
import java.util.*;
public class SmallestPrime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int arr[] = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int min = getMinPrime(arr);
		System.out.println(min);
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */	
		}

	private static int getMinPrime(int[] arr) {
		
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			if(isPrime(arr[i]))
				min=arr[i];
		}
		return min;
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		for (int i = 2; i < num; i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}

}
