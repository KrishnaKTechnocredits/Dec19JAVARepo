package shivaniGDec19.lastTest;

import java.util.Scanner;

public class MoveUppercaseToEnd {
	public static void move(String str) {
		String UpperString = "", LowerString = ""; //Initializing variables
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 'A' && str.charAt(i) < 'Z') //Checking for Uppercase characters
				UpperString += str.charAt(i);
			else
				LowerString += str.charAt(i);
		}
		System.out.println("String after movement is : " + LowerString + UpperString); //Output
	}

	public static void main(String[] args) { //Main of the class
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the string:"); //Taking String from User
		String str = sc.next();
		move(str); //Calling of the method
		sc.close(); 
	}

}
