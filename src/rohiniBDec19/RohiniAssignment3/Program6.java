package rohiniBDec19.RohiniAssignment3;

import java.util.Scanner;

/*WAP to find reverse max length string  a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”} 
b. Output Max length string :- Technocredits c. Max length string reverse value :- stiderconhcet */

public class Program6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String input");
		String str = sc.nextLine();
		findMaxString(str);

	}

	static void findMaxString(String str) {
		int maxLength = 0;
		String maxString = "";
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			if (maxLength < strArr[i].length()) {
				maxLength = strArr[i].length();
				maxString = strArr[i];

			}

		}
		System.out.println("Max Length of string is: " + maxLength + " & String is: " + maxString);
		findReverse(maxString);

	}

	static void findReverse(String maxString) {
		String reverse = "";
		for (int i = maxString.length() - 1; i >= 0; i--) {
			reverse = reverse + String.valueOf(maxString.charAt(i));
		}
		System.out.println("Reverse of string  is: " + reverse);
	}

}
