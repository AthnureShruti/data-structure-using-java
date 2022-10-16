package com.stackDS;

import java.util.Iterator;
import java.util.Scanner;

public class StackImplement {
	
	private String a[];
	private int top;
	private int capacity;
	
	public StackImplement(int size) {
		a=new String[size];
		capacity=size;
		top=-1;
	}
	// ----------------add element to stack------------//
	
	public void push(String x) {
		if (isFull()) {
			System.out.println("Stack overflow");
			System.exit(1);
		}
		System.out.println("Inserting "+x);
		a[++top]=x;
	}
	
	//-----------------remove element from stack---------//
	public String pop() {
		if(isEmpty()) {
			System.out.println("STACK EMPTY");
			System.exit(1);
		}
		return a[top--];
	}

	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==-1;
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		return top==capacity-1;
	}
	public int getSize() {
		return top+1;
	}
	public void printStack() {
		for(int i=0;i<=top;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

	public static void main(String[] args) {
	StackImplement stack=new StackImplement(5);
	Scanner scanner=new Scanner(System.in);
	String string=scanner.next();

//	stack.push("(");
//	stack.push(")");
//	stack.printStack();
	
	}
	

}
