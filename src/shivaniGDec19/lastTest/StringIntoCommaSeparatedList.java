package shivaniGDec19.lastTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringIntoCommaSeparatedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the arrays");
		int size = sc.nextInt();
		System.out.println("Enter the array with String: ");
		String[] str1 = new String[size];
		for (int i = 0; i < size; i++) {
			str1[i] = sc.next();
		}
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str1));
		System.out.println("Modified String is :");
		System.out.println(list); 
		sc.close();

	}

}
