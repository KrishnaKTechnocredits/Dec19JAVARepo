/*
 * WAP to find sum of user given number.
a. Input:- 159753
b. Sum of given number:- 30
 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class SumOfNumber {
	
	int setNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		scan.close();
		return num;
	}
	int calcSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum = sum+(num % 10);
			num = num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		SumOfNumber s = new SumOfNumber();
		int sum = s.calcSum(s.setNum());
		System.out.println("Sum of Entered number is : " + sum);
		
	}

}
