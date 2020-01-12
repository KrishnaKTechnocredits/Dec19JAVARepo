package surajSDec19.Assignments1;
/*You are given a String s, which comprises English alphabets, determine the count of all the
 *vowels in S. Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the
 *String s.
 * 
 * Author: Suraj Shinde
 * 
 * */
import java.util.Scanner;

public class Question_8 {

	void totalVowelCount(String s) {
		char[] ch = s.toCharArray();
		int count = 0;

		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] == 'a') {
				count++;
			} else if (ch[i] == 'e') {
				count++;
			} else if (ch[i] == 'i') {
				count++;
			} else if (ch[i] == 'o') {
				count++;
			} else if (ch[i] == 'u') {
				count++;
			}

		}

		System.out.println("Total count of vowels are:" + count);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = scanner.nextLine();
		Question_8 question_8 = new Question_8();
		question_8.totalVowelCount(s);

	}

}