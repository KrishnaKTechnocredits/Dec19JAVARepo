package assignment3;
/*
 * WAP to find max length String from the given array
 */

public class Question2 {

	static void findMaxLengthString(String[] inputarray) {
		int maxLength = 0;
		String maxLengthName = "";
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i].length() > maxLength) {
				maxLength = inputarray[i].length();
				maxLengthName = inputarray[i];
			}
		}
		System.out.println("Maximum length string is '" + maxLengthName + "' having length " + maxLength);
	}

	public static void main(String[] args) {
		String[] array = { "all the best", "technocredits", "", "maharashtra" };
		findMaxLengthString(array);

	}
}
