package shivaniGDec19.lastTest;

import java.util.Scanner;

public class StringIntoAnotherString {
	public static void appendOfString(String str1, String str2, int position) {
		StringBuffer sb = new StringBuffer(str1);
		sb.insert(position, str2);
		System.out.println("New String is : "+sb.toString()); //Output
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1:"); //Taking original String
		String str1 = sc.next();
		System.out.println("Enter the string 2:"); //Taking string to be inserted
		String str2 = sc.next();
		System.out.println("Enter the position at which string needs to be inserted: "); //Taking at what index strings needs to be added
		int position = sc.nextInt();
		appendOfString(str1, str2, position); //Method getting called
		sc.close();

	}

}
