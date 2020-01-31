/* WAP to reveres user given number 
 * a. Input number:- 456789 
 * b. Output number :- 987654   */
package shitalSDec19.assignment3;

import java.util.Scanner;

public class Solution5 {

	static int reverse =0;

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num!=0)
			{
				reverse = reverse*10;
				reverse = reverse + num%10;
				num = num/10;
			}
		System.out.println(reverse);
}
	
}