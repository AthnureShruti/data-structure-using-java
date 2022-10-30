
package com.ArrayDS;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int size=scanner.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<size;i++) {
			a[i]=scanner.nextInt();
		}
		insertionSort(a);
	}

	private static void insertionSort(int[] a) {
		for(int step=1;step<a.length;step++) {
			int key=a[step];
			int j=step-1;
			
			while (j>=0 && key<a[j]) {
				a[j+1]=a[j];
				--j;
			}
//			System.out.println(j+" "+(j+1));
			a[j+1]=key;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
