package assignment3;

/*
 * WAP to reveres user given number
	a. Input number:- 456789
	b. Output number :- 987654
 */
import java.util.Scanner;

public class Question5 {

	static void reverseGivenNumber() {
		/*
		 * Method will take user number and will print reverse of it.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:- ");
		String inputNumber = s.nextLine();
		String reverseNum = "";

		for (int i = inputNumber.length() - 1; i >= 0; i--) {
			reverseNum = reverseNum + String.valueOf(inputNumber.charAt(i));
		}
		System.out.println(reverseNum);
	}

	public static void main(String[] args) {
		reverseGivenNumber();
	}

}
