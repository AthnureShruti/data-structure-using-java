package com.ArrayOperations;

import java.util.Scanner;

public class ChecckArrayDescending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array");
		int size=sc.nextInt();
		int numbers[]= new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
			}
		
		boolean isDescending=true;
		
		for(int i=0;i<numbers.length-1;i++) {
			if(numbers[i]<numbers[i+1]) {
				isDescending=false;
			}
		}
		
		if(isDescending) {
			System.out.println("Array is in Descending order !!");
		}
		else {
			System.out.println("Array is not in Descending order !!");
		}
		

	}

}
