/*WAP to move all uppercase character to the end of the String"
 * Input: Hellow There
	Output: ellow hereHT  */

package ankitaPDec19.examprogram;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String[] ar = s.nextLine().split(" ");
		for (int i = 0; i < ar.length; i++) {
			String sr = ar[i];
			display(sr);
		}
	}

	static void display(String sr) {
		String str = "";
		String name = "";
		for (int i = 0; i < sr.length(); i++) {
			char ch = sr.charAt(i);
			if (Character.isUpperCase(ch))
				str = str + String.valueOf(ch);
			else
				name = name + String.valueOf(ch);
		}
		System.out.print(name + str);
	}

}
