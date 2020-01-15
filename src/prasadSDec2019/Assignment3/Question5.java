package Assignment3;

import java.util.Scanner;

public class Question5 {
	
	void reverseNum() {
		int num;
		System.out.println("Enter total numbr of elements");
		Scanner scn=new Scanner(System.in);
		num=scn.nextInt();
		System.out.print("Inputs are:");
		int a[]=new int[num];
		for(int i=0;i<num;i++) {
			a[i]=scn.nextInt();
		}
		
		System.out.println("Reverse Elements are");
		for (int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args) {
		Question5 q5=new Question5();
		q5.reverseNum();
	}
}
