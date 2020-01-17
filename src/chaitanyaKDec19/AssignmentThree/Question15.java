package chaitanyaKDec19.AssignmentThree;

public class Question15 {

	void displayString(String[] string, int length) {

		String nameString = "";

		// Checking length of each string from array. If it is maximum than given length
		// then printing it

		System.out.print("Strings having length more than " + length + " are: ");

		for (int i = 0; i < string.length; i++) {

			nameString = string[i];

			if (nameString.length() > length) {

				System.out.print(string[i]);
				System.out.print(" , ");

			}
		}

	}

}
