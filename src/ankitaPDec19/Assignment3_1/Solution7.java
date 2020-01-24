/*WAP to find Factorial series for user defined number
a. Input number :- 5
b. Output :- 120*/
package ankitaPDec19.Assignment3_1;

import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		Solution7 solution7 = new Solution7();
		System.out.println(solution7.fact(num));
	}

	int fact(int num) {
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

}
