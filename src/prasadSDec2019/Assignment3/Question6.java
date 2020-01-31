package prasadSDec2019.Assignment3;
//WAP to find reverse max length string  
//a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”} 
//b. Output Max length string :- Technocredits 
//c. Max length string reverse value :- stiderconhcet 
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class Question6 {
	
	void maxLen(String s[]) {
		int i;
		System.out.println("Elements are:");
		for(i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		int maxLen=0;
		String longString="";
		for(i=0;i<s.length;i++) {
			if(s[i].length()>maxLen) {
				maxLen=s[i].length();
				longString=s[i];
				
			}
		}
		System.out.println("Longest String is: "+longString);
		
		for(i=longString.length()-1;i>=0;i--) {
			System.out.print("Reverse string is"+longString.charAt(i));
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
		Question6 q6=new Question6();
		q6.maxLen(s);
	}
}
