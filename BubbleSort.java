package com.ArrayDS;

import java.util.Iterator;
import java.util.Scanner;


public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int size=scanner.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=scanner.nextInt();
			
		}
		
		
		BubbleSort(a);

	}

	private static void BubbleSort(int[] a) {
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);

		}
		
	}

}
