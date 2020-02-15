package shivaniGDec19.lastTest;

import java.util.Scanner;

public class RemoveAllNonAlphabets {
	public static void removeAllNonAlphabets(String str1) {
		str1 = str1.trim();	//Removing Spaces
		String[] newString = str1.split("\\W+"); //Removing non alphabetic characters and converting String to Array
		for (int i = 0; i < newString.length; i++) {
			System.out.println(newString[i]+ " "); //Printing the string
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1:"); // Taking original String
		String str1 = sc.next();
		removeAllNonAlphabets(str1); //Method Calling
		sc.close();
	}

}
