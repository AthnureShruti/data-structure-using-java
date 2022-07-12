package com.ArrayOperations;

import java.util.Scanner;

public class MxMinArray {

	public static void main(String[] args) {
		//Scanner class object 
		Scanner sc =new Scanner(System.in);
		System.out.print("Entee the size of array : ");
		int size=sc.nextInt();
		
		
		//declaring array of integer type
		int numbers[]=new int[size];
		
		System.out.println("Enter "+size+" elements in array : ");
		//array element from user
		for(int  i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
			}
		
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		
		//array traversal 
		for(int i=0;i<numbers.length;i++) {
			
			//condition for max element 
			if(numbers[i]>max) {
				max=numbers[i];
				
			}
			
			//condition for min element
			if(numbers[i]<min) {
				min=numbers[i];
			}
		}
		
		//priniting max n min element from array
		System.out.println("Max element in array is : "+max);
		System.out.println("Min element in array is : "+min);

	}

}
