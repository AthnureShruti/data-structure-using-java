package com.ArrayDS;

import java.util.Scanner;

public class SpecialIndex {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string="";
		int mid=0;
		String[] str= {"cdcdccd","dcc","ccd","cddddd"};
			//{"aabbabbaaaaaaaaaa","ababab","aaaabbbbabbaabb"};
		
//			
		String encryptedString = "";
		int r=0;
		for(int i=0;i<str.length;i++) {
			string=str[i];
			
				 mid=string.length()/2;
				 char ch=string.charAt(mid);
				 int count = getCount(ch,str[i]);
				  r=count/mid;
//				 encryptedString=encryptedString+ch+count+"";
				 System.out.print(string.charAt(r));
		}
	}
	private static int getCount(char ch, String dataString) {
		int count = 0;
		for (int i = 0; i < dataString.length(); i++) {
			if(ch==dataString.charAt(i))
				count++;
		}
		return count;
	}

}
