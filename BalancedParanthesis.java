package com.stackDS;

import java.util.Iterator;
import java.util.Stack;

public class BalancedParanthesis 
{
	public static void main(String[] args) 
	{
		String string="[()]";
		int flag=0;
		System.out.println(checkParenthesis(string));
	}
	private static boolean checkParenthesis(String string) 
	{
		Stack<Character> stack= new Stack<>();
		for (int i = 0; i < string.length(); i++) 
		{
			char x=string.charAt(i);
			if(string.charAt(i)=='{' || string.charAt(i)=='[' || string.charAt(i)=='(' ) 
			{
				stack.push(string.charAt(i));
			}
			if(stack.isEmpty())
			{
				return false;
			}
			char check;
			switch (x) {
			case ')': 
				check=stack.pop();
				if(check=='}' && check==']') 
				{
					return false;
				}
			break;
			case ']':
				check=stack.pop();
				if(check=='}' && check==')') 
				{
					return false;
				}
				break;
			case '}':
				check=stack.pop();

				if(check==']' && check==')') 
				{
					return false;
				}
				break;
			}
		}
		return (stack.isEmpty());
	}
}
