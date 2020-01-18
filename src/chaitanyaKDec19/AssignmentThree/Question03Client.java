package chaitanyaKDec19.AssignmentThree;

/*
 * WAP to find frequency of user defined character in user defined String
 */

public class Question03Client {

	public static void main(String[] args) {

		// declaring string variable with value
		String string = "electrical engineering";
		char ch = 'e';

		// calling method to count the occurrence of given character in a string
		new Question03().displayCharCount(string, ch);

	}

}
