package prasadSDec2019.Assignment3;

import java.util.Scanner;

public class Question11 {
	 void palindrome(int n) {
		 int temp=n;
		 int rem,s=0;
		 while(n>0) {
			 rem=n%10;
			 n=n/10;
			 s=s*10+rem;
		 }
		 if(s==temp) {
			 System.out.println("Number "+temp+" is palindrom");
		 }
		 else {
			 System.out.println("Number "+temp+" is not palindrom");
		 }
	 }

	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=scn.nextInt();
		Question11 q11=new Question11();
		q11.palindrome(n);
	}
}
