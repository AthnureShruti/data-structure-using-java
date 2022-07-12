package com.ArrayOperations;

import java.util.Scanner;

public class CheckArrayAscending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array");
		int size=sc.nextInt();
		int numbers[]= new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
			}
		
		boolean isAscending=true;
		
		for(int i=0;i<numbers.length-1;i++) {
			if(numbers[i]>numbers[i+1]) {
				isAscending=false;
			}
		}
		
		if(isAscending) {
			System.out.println("Array is in ascending order !!");
		}
		else {
			System.out.println("Array is not in ascending order !!");
		}
		

	}

}
