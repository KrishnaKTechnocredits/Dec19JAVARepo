package prasadSDec2019.Assignment3;
// WAP to find string which has length more than 7characheter

import java.util.Arrays;
import java.util.Scanner;

public class Question15 {

	void maxLen(String s[]) {
		int i;
		System.out.println("Elements are: ");
		for(i=0;i<s.length;i++) {
			System.out.print(" ");
			System.out.print(s[i]);
		}
		
		int maxLen=7;
		String stringIs[]= {};
		System.out.println();
		System.out.println("Longest String is: ");
		for(i=0;i<s.length;i++) {
			if(s[i].length()>=maxLen) {
				System.out.print(" ");
				System.out.print(s[i]);
			}
		}
		
		
		
	}
	

	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int numOfElements=scn.nextInt();
		String s[]=new String[numOfElements];
		System.out.println("Insert elements");
		for(int i=0;i<s.length;i++) {
			s[i]=scn.next();
		}		
		Question15 q15=new Question15();
		q15.maxLen(s);
	}
}
