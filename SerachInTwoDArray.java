package com.ArrayOperations;

import java.util.Scanner;

public class SerachInTwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row : ");
		int row=sc.nextInt();
		System.out.print("\nEnter columns : ");
		int col=sc.nextInt();
		System.out.println("Enter array elements : ");
		int num[][]=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				num[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Enter element to be searched : ");
		int x=sc.nextInt();
		boolean isFound=false;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(num[i][j]==x) {
					isFound=true;
					System.out.println("Element "+x+" found at position ["+i+"]["+j+"]");
					
					// NOTE::::If same elements are present in array then it will print all same element with their position
				}
				
			}
		}
		
		//this is optional part for if element not found in array
		if(isFound==false) {
			System.out.println("Element "+x+" not found in array");
		}
		

	}

}
