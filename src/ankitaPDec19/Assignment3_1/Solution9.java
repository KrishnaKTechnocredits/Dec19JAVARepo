/*WAP to find average of user given array
a. Input :- {14, 32, 19, 14, 78,36}
b. Output:- 32.16 */
package ankitaPDec19.Assignment3_1;

import java.util.Scanner;

public class Solution9 {

	public static void main(String[] args) {
		System.out.println("Enter number of Elements");
		Scanner s = new Scanner(System.in);
		int size = Integer.parseInt(s.next());
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the number");
			a[i] = s.nextInt();
		}
		add(a);
	}

	static void add(int[] a) {
		int sum = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}
		double avg = (double) sum / a.length;
		System.out.println("The average of the number is:" + avg);
	}

}
