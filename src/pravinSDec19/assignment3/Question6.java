package pravinSDec19.assignment3;

/*
 * Created by : Pravin Sarda
 * Assignment 3 : Question 6
	WAP to find reverse max length string
	a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
	b. Output Max length string :- Technocredits
	c. Max length string reverse value :- stiderconhcet
 * 
 * 
 * 
 */

public class Question6 {

	// findMaxString method is used to find max length string from given string array 
	String findMaxString(String[] stringArray) {

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

		System.out.println("Large String: " + stringArray[maxIndex]);
		return stringArray[maxIndex];

	}

	// reverseString method is used to reverse string to given string 
	void reverseString(String str) {
		
		String revStr="";
		
		for (int i = str.length() - 1 ; i >=0 ; i--) {

			revStr = revStr + str.charAt(i);
		}
		
		System.out.println("Reverse Large String: " +revStr);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question6 q6 = new Question6();
		String[] strArray = { "all the best", "technocredits", "", "maharashtra" };
		String maxStr = q6.findMaxString(strArray);
		q6.reverseString(maxStr);
		

	}
}
