package com.ArrayOperations;

import java.util.Scanner;

public class ArrayInputDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size=sc.nextInt();
		
		//array declararion of type String 
		String names[]=new String[size];
		
		//input name from user
		for(int i=0;i<size;i++) {
			System.out.print("Enter name of at position "+i+" : ");
			names[i]=sc.next();
			}
		
		
		//printing names  from array of string type with their position
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+" is at position "+i);
		}
	}

}
