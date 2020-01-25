package prasadSDec2019.Assignment3;

import java.util.Scanner;

public class Question8 {
	int findVowels(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
			{
				count++;
				
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.nextLine();
		Question8 q8=new Question8();
		int count=q8.findVowels(s);
		System.out.println("Total number of Vowels present in string are:"+count);
	}
}
