package rohiniBDec19.RohiniAssignment3;

import java.util.Scanner;

/*9) WAP to find average of user given array a. Input :- {14, 32, 19, 14, 78,36} b. Output:- 32.16 */

public class Program9 {

	static int length;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter for how many nubers you wnat averag");
		length = sc.nextInt();
		int[] numArr = new int[length];
		System.out.println("Enter " + length + " Elements");
		for (int i = 0; i < length; i++) {
			numArr[i] = sc.nextInt();
		}
		System.out.println("Average of given nubers is: " + findAvg(numArr));
	}

	static double findAvg(int[] numArr) {
		int sum = 0;
		double avg;
		for (int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];

		}
		avg = sum / length;
		return avg;
	}

}
