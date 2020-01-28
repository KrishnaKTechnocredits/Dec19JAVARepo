/*
 * )WAP to find number is Armstrong or not.
a. Int number = 153
i. Number is Armstrong
b. Int number = 234
i. Number is not Armstrong
Note :- Armstrong number means sum of each number cubes to number
it self
 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class Armstrong {

	int checkArmstrong(int num)
	{
		int sum =0;
		while(num>0)
		{
			sum =sum +((num%10)*(num%10)*(num%10));
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Armstrong obj1 = new Armstrong();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		int sum = obj1.checkArmstrong(num);
		System.out.println("The sum of cubes of each number is : "+sum);
		if(num==sum)
			System.out.println("Entered number is Armstrong!");
		else 
			System.out.println("Entered number is not Armstrong!");
		scan.close();
	}
}
