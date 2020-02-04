package kedarKDec19.Assignment3;

import java.util.Scanner;

public class Question7 {
	
	/*
	 * Factorial of number 
	 * 
	 * 
	 */
	
	static void fact(int a) {
		
		int fact=1;
		
		for(int i=1;i<=a;i++) {
			fact=fact*i;
			
			
		}
		
		System.out.println("factorial of number:"+fact);
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		fact(a);
		
	}

}
