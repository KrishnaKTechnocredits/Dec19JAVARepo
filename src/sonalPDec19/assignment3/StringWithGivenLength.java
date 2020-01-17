package assignment3;

import java.util.Scanner;

/*
 * WAP to find string which has length more than 7 characters.
 */
public class StringWithGivenLength{

	void findString(String[] input) {
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter character length: ");
		int charLength = ch.nextInt();
		String stringNames = "";

		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > charLength)
				stringNames = stringNames + input[i] + " ";
		}
		System.out.println("String having length more than 7 characters: "+stringNames);

	}

	public static void main(String[] args) {
		StringWithGivenLength stringwithgivenlength = new StringWithGivenLength();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int size = s.nextInt();
		String[] array = new String[size];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter name"+(i+1)+": ");
			array[i] = s.next();
		}

		stringwithgivenlength.findString(array);
	}

}
