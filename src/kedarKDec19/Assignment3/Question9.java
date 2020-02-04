package kedarKDec19.Assignment3;

import java.util.Scanner;

public class Question9 {
	
	
	
	public static void main(String[] args) {
		
		double sum = 0;
		System.out.println("Enter the number to find the average");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int n[] = new int[a];
		System.out.println("enter the elements");
		for (int i = 0; i < n.length; i++) {
			n[i] = s.nextInt();
			sum = sum + n[i];
		}
		int length=n.length;
		double average=sum/length;
		System.out.println("sum of number is:"+sum);
		 System.out.println("Average of number is :"+average);
	}


	}


