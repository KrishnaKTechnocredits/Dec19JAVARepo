package shivaniGDec19.assignment1;

import java.util.Scanner;

public class SumOfArray {
	public static int sum(int[] input)
	{
		int sum = 0;
		for (int i =0; i<4 ; i ++){
			sum = sum + input[i];
		}
		return (sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[4];
		System.out.println("Enter elements in array to add (Size 4) : ");
		for (int i =0; i<4 ; i ++){
			input[i] = sc.nextInt();
		}
		System.out.println("Sum : " + sum(input));
		sc.close();
		}

	}


