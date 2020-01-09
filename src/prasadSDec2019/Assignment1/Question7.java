package prasadSDec2019.Assignment1;
import java.util.Scanner;

//You are given two numbers N and M, print the absolute difference between two numbers 

public class Question7 {
	void absoluteDifference() {
		int num1,num2,diff;
		System.out.println("Enter two numbers to find out absolute difference");
		Scanner scn=new Scanner(System.in);
		num1=scn.nextInt();
		num2=scn.nextInt();
		if(num1>num2) {
			diff=num1-num2;
			System.out.println("Absolute difference is "+diff);
		}
		else {
			diff=num2-num1;
			System.out.println("Absolute difference is "+diff);	
		}
	}

	public static void main(String[] args) {
		Question7 q7=new Question7();
		q7.absoluteDifference();

	}

}
