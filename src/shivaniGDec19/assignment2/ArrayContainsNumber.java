package shivaniGDec19.assignment2;

import java.util.Scanner;

public class ArrayContainsNumber {
static void searchnumber(int[] array, int search){
	for (int i = 0; i< array.length; i++)
		if(search == array[i])
			System.out.println("Number is at position : " + i);
		else 
			System.out.println("Number is not in array");
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the arrays");
		int size = sc.nextInt();
		System.out.println("Enter the array with numbers: ");
		int[] array1 = new int[size];
		for (int i = 0; i < size; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter the number you want to search");
		int search = sc.nextInt();
		searchnumber(array1,search);
		sc.close();
	}

}
