/*5) WAP to reveres user given number
a. Input number:- 456789
b. Output number :- 987654*/
package ankitaPDec19.Assignment3_1;

import java.util.Scanner;

public class Solution5 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		String num = s.next();
		Solution5 solution5 = new Solution5();
		System.out.println(Integer.parseInt(solution5.reverse(num)));
	}

	String reverse(String num) {
		String s = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			s = s + num.valueOf(num.charAt(i));
		}
		return s;
	}
}
