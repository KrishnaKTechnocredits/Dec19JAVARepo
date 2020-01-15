package prasadSDec2019.Assignment3;

import java.util.Scanner;

public class Question7 {
	int factorial() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scn.nextInt();         //5
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		return fact;
	}

	public static void main(String[] args) {
		Question7 q7=new Question7();
		int fact=q7.factorial();
		System.out.println("Factorial of number Is:"+fact);
	}
}
