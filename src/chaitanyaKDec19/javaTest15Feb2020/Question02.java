package chaitanyaKDec19.javaTest15Feb2020;

/*
 * WAP to Insert a String into another String in Java
 * Input: TechnoPune
 * Output: TechnoCreditsPune	
 * Another String: CreditesAfter the Techno
 */

public class Question02 {

	public static void main(String[] args) {

		String string = "TechnoPune";
		String anotherString = "Credits";

		// Calling method and printing the result returned from method
		System.out.println("Original String is: " + string + " String to be inserted is: " + anotherString
				+ " and output is: " + new Question02().stringManipulation(string, anotherString, 5));

	}

	// Method to insert one string in to another
	private String stringManipulation(String originalString, String anotherString, int position) {

		String newString = new String();

		// Loop to get values from original string to another string and if
		// the value of i reaches index where we want to insert another string
		// then inserting it
		for (int i = 0; i < originalString.length(); i++) {

			newString += originalString.charAt(i);

			if (i == position) {

				newString += anotherString;
			}

		}

		return newString;
	}

}
