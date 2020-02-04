/* WAP to find number is Armstrong or not. 
 * a. Int number = 153 i. Number is Armstrong 
 * b. Int number = 234 i. Number is not Armstrong  
 * Note :- Armstrong number means sum of each number cubes to number it self. */

package shitalSDec19.assignment3_resubmisson;

import java.util.Scanner;

public class Solution13 {
	int sum = 0;
	int original_no;

	void findArmstrong(int num) {
		original_no = num;

		for (int i = 0; i < 5; i++) {
			int num1 = num;
			num1 = num1 % 10;
			// System.out.println(num1);
			num = num / 10;
			int multiply = num1 * num1 * num1;
			// System.out.println(multiply);
			sum = sum + multiply;
			// System.out.println(sum);
		}
		if (original_no == sum)
			System.out.println("given no " + original_no + " is armstrong no");
		else
			System.out.println("given no " + original_no + " is NOT an armstrong no");
	}

	public static void main(String[] args) {
		System.out.println("please provide number");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Solution13 solution13 = new Solution13();
		solution13.findArmstrong(size);
	}
}
