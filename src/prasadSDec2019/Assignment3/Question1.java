package Assignment3;

import java.util.Scanner;

public class Question1 {
	void positiveNegitive() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of array");
		int num=scn.nextInt();
		System.out.println("Elements present in array are");
		int a[]=new int[num];
		for(int i=0;i<a.length;i++) {
			a[i]=scn.nextInt();
		}
		
		
	}

	public static void main(String[] args) {
		Question1 q1=new Question1();
		q1.positiveNegitive();

	}

}
