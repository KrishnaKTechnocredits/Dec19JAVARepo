/*WAP to find sum of user given number.
a. Input:- 159753
b. Sum of given number:- 30
 * */
package ankitaPDec19.Assignment3_1;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class Solution4 {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		String num = s.next();
		sum(num);
	}

	static void sum(String num) {
		char[] ch = new char[num.length()];
		int add = 0;
		for (int i = 0; i < num.length(); i++) {
			ch[i] = num.charAt(i);
			add = add + Integer.parseInt(String.valueOf(ch[i]));
		}
		System.out.println("Sum of given number:- " + add);
	}

}
