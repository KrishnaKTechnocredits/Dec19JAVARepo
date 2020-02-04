package kedarKDec19.Assignment3;

import java.util.Scanner;

public class Question8 {
	/*
	 * Vowels in given string
	 * 
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] chars=str.toCharArray(); //convert string to character
		int count=0;
		for (char c:chars)
		switch(c){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
			
		}
		System.out.println(count);
	}
	
		
		
		
	
	}


