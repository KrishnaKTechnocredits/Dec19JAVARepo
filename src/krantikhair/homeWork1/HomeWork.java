/*
 * /*
 * Write a program to accept string and display
 * upper case  Letters
 * lower case  Letters
 * Odd number sum
 * special Characters
 * Even Number sum
 * 
 */

package krantikhair.homeWork1;

public class HomeWork {

	static void Display(String a) {

		String upper = "";
		String lower = "";
		String special = "";
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < a.length(); i++)

		{
			String number = "";
			boolean isdigit = Character.isDigit(a.charAt(i));
			boolean isupper = Character.isUpperCase(a.charAt(i));
			boolean islower = Character.isLowerCase(a.charAt(i));
			if (isdigit) {

				number = number + a.charAt(i);

				if (Integer.parseInt(number) % 2 == 0)
					evenSum = evenSum + Integer.parseInt(number);
				else
					oddSum = oddSum + Integer.parseInt(number);

			}

			else if (isupper) {
				upper = upper + a.charAt(i);
			} else if (islower) {
				lower = lower + a.charAt(i);
			}

			else {
				special = special + a.charAt(i);
			}

		}
		System.out.println("The sum of even number is : " + evenSum);
		System.out.println("The sum of odd number is : " + oddSum);
		System.out.println("The upper case is : " + upper);
		System.out.println("The lowercase is: " + lower);
		System.out.println("The Special characters are: " + special);
		System.out.println("The final answer is : " + lower + evenSum + upper + oddSum + special);

	}

	public static void main(String[] args) {
		String a = "5458%#@5HDTss";
		Display(a);
	}

}
