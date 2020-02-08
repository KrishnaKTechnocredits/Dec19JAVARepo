package vishwasCDec19.assignment3;
import java.util.Scanner;

/*
 * WAP which fulfill below condition 
 * a. WAP to find positive and negative number from the given array  
 * b. check the sum of individual. 
 */
public class Q1 
{
	static int positiveSum;
	static int negativeSum;

	public static void positiveNegativeNum(int[] input) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				System.out.print(" " + input[i]);
				negativeSum = negativeSum + (input[i]);
				
			} else {
				positiveSum = positiveSum + (input[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = s.nextInt();
		int[] input = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element");
			input[i] = s.nextInt();
		}
		System.out.print("Positive numbers are");
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				System.out.print(" " + input[i]);
			}
		}
		System.out.print("\nNegative numbers are");
		positiveNegativeNum(input);
		System.out.println("\nNegative number sum " + negativeSum * (-1));
		System.out.println("Positive number sum " + positiveSum);
	}
}
