package com.ArrayDS;

public class NoVowelsConst {

	public static void main(String[] args) {
		String str="aeiou";
		int vowels=0;
		int constants=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' 
					|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'  ) {
				
				vowels++;
			}
			else {
				constants++;
			}
			
		}
		System.out.println("No. of Vowels = "+vowels);
		System.out.println("No. of Constants = "+constants);


	}

}
