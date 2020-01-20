package assignment3;
/*
 * WAP to find reverse max length string
	 a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
	 b. Output Max length string :- Technocredits
	 c. Max length string reverse value :- stiderconhcet
 */

public class Question6 {

	static void reverseMaxLengthString(String[] inputArray) {
		/*
		 * This method will identify max length string from array. It will print max
		 * length string and its reverse value.
		 */
		int maxLength = 0;
		String maxLengthString = "";
		String reverseMaxString = "";
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].length() > maxLength) {
				maxLength = inputArray[i].length();
				maxLengthString = inputArray[i];
			}
		}
		System.out.println("Max length string:- " + maxLengthString);

		for (int j = maxLengthString.length() - 1; j >= 0; j--) {
			reverseMaxString = reverseMaxString + String.valueOf(maxLengthString.charAt(j));
		}
		System.out.println("Max length string reverse value :- " + reverseMaxString);
	}

	public static void main(String[] args) {
		String[] array = { "all the best", "technocredits", " ", "maharashtra" };
		reverseMaxLengthString(array);
	}

}
