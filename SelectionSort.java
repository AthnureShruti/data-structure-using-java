package com.ArrayDS;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int size=scanner.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=scanner.nextInt();
			
		}
		SelectionSort(a);

	}

	private static void SelectionSort(int[] a) {
		int min_index;
		for(int i=0;i<a.length-1;i++) {
			min_index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					min_index=j;
				}
			}
			int temp=a[i];
			a[i]=a[min_index];
			a[min_index]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
