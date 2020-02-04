package shivaniGDec19.assignment3;

// WAP to find frequency of user defined character in user defined String
import java.util.Scanner;

public class FreqCharInString {

	void charFreq(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(ch + " : " + count);
	}

	public static void main(String[] args) {
		FreqCharInString allCharFreq = new FreqCharInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String input = sc.nextLine();
		System.out.println("Enter character : ");
		char ch = sc.next().charAt(0);
		allCharFreq.charFreq(input, ch);
		sc.close();
	}
}
