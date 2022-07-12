package com.ArrayOperations;
import java.util.*;
public class ArrayBasics {
	public static void main(String args[]) {
		
		//declaring size of array 
		int size;
		Scanner sc=new Scanner(System.in);
		
		
		//taking size from user with scanner object 
		size=sc.nextInt();
		
		//declaring array of int type
		int[] num=new int[size];
		
		//another way of declaring array
		//int marks[]=new int[3];
		
		
		//print array element at particular position 
		//System.out.println(marks[1]);		
		
		//takeing array element input from user
	    for(int i=0;i<size;i++) {
	    	num[i]=sc.nextInt();
	    }
	    
	    //enter which variable should find 
		int x=sc.nextInt();
		
		
		//array traversing 
		for(int i=0;i<num.length;i++) {
			
			//condition for searching a element in array
			if(num[i]==x) {
				System.out.println("X found at index : "+i);

			}
			//System.out.println(num[i]);
			
		}
		
		
	}
}
