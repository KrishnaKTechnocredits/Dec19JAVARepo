package swatiShinde30.assignment3;
import java.util.Scanner;

/*
 * 10) WAP to sum of two array 
 */
public class Question10 {
	static int sum = 0;

	public static void addArray(int[] Array) {
		for (int i = 0; i < Array.length; i++) {
			sum = sum + (Array[i]);
		}
	}

	static int[] arrayAcceptance() {

		System.out.println("Enter array size");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] A = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element");
			A[i] = s.nextInt();
		}
		return A;
	}
	public static void main(String[] args) {

		int[] firstArray = arrayAcceptance();
		addArray(firstArray);
		int[] secondArray = arrayAcceptance();
		addArray(secondArray);
		System.out.println("Sum of both arrays is "+sum);
	}
}
