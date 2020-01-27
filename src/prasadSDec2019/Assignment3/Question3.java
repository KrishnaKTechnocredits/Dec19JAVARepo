package prasadSDec2019.Assignment3;

import java.util.Scanner;

public class Question3 {
	void frequencyOfChar(String s,char c){
		int count=0;
		String temp=s.toLowerCase();
		//System.out.println(temp);
		for(int i=0;i<temp.length();i++) {
			if(temp.charAt(i)==c) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string:");
		char c='e';
		String s=scn.nextLine();
		Question3 q3=new Question3();
		q3.frequencyOfChar(s,c);
	}
}
