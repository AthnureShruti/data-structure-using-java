
package com.ArrayOperations;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row : ");
		int row=sc.nextInt();
		System.out.print("\nEnter columns : ");
		int col=sc.nextInt();
		
		int array[][]=new int[row][col];
		//for rows
		for(int i=0;i<row;i++) {
			
			
			//for columns
			for(int j=0;j<col;j++) {
				array[i][j]=sc.nextInt();
				
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(array[i][j]+" ");
			}
			//after a row completes break a line to next line
			System.out.println();
		}
	}
	

}
