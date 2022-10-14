package com.ArrayDS;

import java.awt.Image;
import java.util.Scanner;

public class RemoveDuplicacy {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter size of 1st array :");
		int size=scanner.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=scanner.nextInt();
		}
		
		RemoveDuplicacy(a);
	}

	private static void RemoveDuplicacy(int[] a) {
		int n=a.length;
		int temp[]=new int[n];
		int j=0;
		 for (int i=0; i<n-1; i++){  
	            if (a[i] != a[i+1]){  
	                temp[j++] = a[i];  
	            }  
	         }  
		temp[j++]=a[n-1];
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		
		
		
	}

}
