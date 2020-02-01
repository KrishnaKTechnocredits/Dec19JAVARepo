package rohiniBDec19.RohiniAssignment3;

import java.util.Scanner;

/*15) WAP to find string which has length more than 7characheter. 
 * a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”} 
 * b. Output :- Krishna, aakansha, abhishek */

public class Program15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String input");
		String str = sc.nextLine();
		System.out.println("String greater than 7 chacters are: ");
		findString(str);

	}

	private static void findString(String str) {
		int length = 7;
		String maxString = "";
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			if (length < strArr[i].length()) {
				length = strArr[i].length();
				maxString = strArr[i];
				System.out.println(maxString);
			}

		}

	}

}
