package sairajJDec19.assignment1;
import java.util.Scanner;

public class ArrayInput {
	
	public static void main(String[] args) {
		System.out.println("Enter Size of array = ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int index = 0;
		int[] arr = new int[size];
		while(index<size) {
			System.out.println("Enter Input : ");
			arr[index] = sc.nextInt();
		}
		sc.close();
		System.out.println(arr);
		
	}
}
