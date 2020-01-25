package swatiShinde30.assignment3;
/*
 * WAP to find string which has length more than 7characheter. 
 */
import java.util.Scanner;

public class Question15 {

	static void display(String[] strArr) {
		System.out.print("String array is :-{");
		for (int i = 0; i < strArr.length; i++) {
			// strArr[i]=s.next();
			System.out.print(strArr[i] + " ");
		}
		System.out.print("}");
	}

	static void criteria(String[] strArr) {
		System.out.println("\nStrings with more than 7 characters are");
		for (int j = 0; j < strArr.length; j++) {
			if (strArr[j].length() > 7) {
				System.out.print(strArr[j]);
			}
		}
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
		criteria(strArr);
	}

}
