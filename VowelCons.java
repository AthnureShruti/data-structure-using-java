package com.ArrayDS;

import java.util.Scanner;

public class VowelCons {

	public static void main(String args[])
	  {
	    Scanner sc=new Scanner(System.in);
	    char c=sc.next().charAt(0);
	    String str="aeiouAEIOU";
	    String msg="Vowel";
	    if(c=='a'  || c=='e'  || c=='i'  || c=='o'  ||  c=='u'
	      ||c=='A'  || c=='E'  || c=='I'  || c=='O'  ||  c=='U')
	    {
	      msg="Vowel";}
	    else {
	    	msg="Conconant";
		}
	    System.out.print(msg);
	    }
	   
	
	    
	    
	   
	  }


