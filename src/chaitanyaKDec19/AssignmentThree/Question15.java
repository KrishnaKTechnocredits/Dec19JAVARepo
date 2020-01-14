package chaitanyaKDec19.AssignmentThree;

public class Question15 {

	void displayString(String[] string, int length) {

		String nameString = "";

		for (int i = 0; i < string.length; i++) {

			nameString = string[i];

			if (nameString.length() >= length) {

				System.out.print(string[i]);
				System.out.print(" , ");

			}
		}

	}

}
