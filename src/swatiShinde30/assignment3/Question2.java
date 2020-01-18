package swatiShinde30.assignment3;
/*
 * WAP to find max length String from the given array. 
 */
import java.util.Scanner;

public class Question2 {

	static void display(String[] strArr) {
		System.out.print("String array is :-{");
		for (int i = 0; i < strArr.length; i++) {
			// strArr[i]=s.next();
			System.out.print(strArr[i] + " ");
		}
		System.out.print("}");
	}

	static void maxLength(String[] strArr) {
		int max = 0;
		String large = null;
		for (int j = 0; j < strArr.length; j++) {
			if (strArr[j].length() > max) {
				max = strArr[j].length();
				large = strArr[j];
			}

		}
		System.out.println("Maximum length is " + max);
		System.out.println("String with max length is " + large);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = s.nextInt();
		System.out.println("Enter array of strings");
		String[] strArr = new String[size];

		for (int i = 0; i < size; i++) {
			strArr[i] = s.next();
		}
		display(strArr);
		maxLength(strArr);
	}

}
