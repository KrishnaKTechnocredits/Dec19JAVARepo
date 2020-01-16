package swatiShinde30.assignment3;
/*
 *  WAP to find vowels in given string 
 */
import java.util.Scanner;

public class Question8 {
	static int count;
	static void frequency(String given) {
		for (int i = 0; i < given.length(); i++) {
			if (given.charAt(i) == 'a') {
				count++;
			} else if (given.charAt(i) == 'e') {
				count++;
			} else if (given.charAt(i) == 'i') {
				count++;
			} else if (given.charAt(i) == 'o') {
				count++;
			} else if (given.charAt(i) == 'u') {
				count++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String given = s.nextLine();
		frequency(given);
		System.out.println(count);
	}

}
