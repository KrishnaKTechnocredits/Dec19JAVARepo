package sairajJDec19.assignment3;
import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		int sum =0;
		System.out.println("Enter the numbers: ");
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
