package pravinSDec19.assignment3;
/*
 * Created By : Pravin Sarda
 * Assignment 3 : Question 2
 * 
 * WAP to find max length String from the given array.
	a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
 * 
 * 
 */

public class Question2 {

	// displayMaxLenghString method is used to find largest length string from given
	// array
	void displayMaxLenghString(String[] stringArray) {

		int maxLength = 0;
		int maxIndex = 0;

		for (int i = 0; i < stringArray.length; i++) {

			String str = stringArray[i];
			int strLength = str.length();

			if (maxLength < strLength) {

				maxLength = strLength;
				maxIndex = i;

			}

		}

		System.out.println("Largest Length of String is: " + stringArray[maxIndex]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nameArray = { "all the best", "technocredits", "", "maharashtra" };
		Question2 q2 = new Question2();
		q2.displayMaxLenghString(nameArray);

	}
}
