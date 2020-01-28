package assignment3;

/*
 * WAP to find vowels in given string
	a. Input :- automation engineering
	b. Count :- 11
 */
import java.util.Scanner;

public class Question8 {

	static void findVowelCount() {
		/*
		 * This method will take string as user input, will convert character in lower case and
		 * print vowels count in string.
		 */
		
		int count = 0;
		char lowerCaseChar;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string:- ");
		String inputString = s.nextLine();

		for (int i = 0; i < inputString.length(); i++) {
			lowerCaseChar = Character.toLowerCase(inputString.charAt(i));
			if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'o' || lowerCaseChar == 'u'
					|| lowerCaseChar == 'i') {
				count++;
			}
		}
		System.out.println("Vowel count in given string: " + count);

	}

	public static void main(String[] args) {
		findVowelCount();
	}

}
