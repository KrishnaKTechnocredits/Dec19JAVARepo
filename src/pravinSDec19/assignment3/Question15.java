package pravinSDec19.assignment3;
/*
 * Created By : Pravin Sarda
 * Assignment 3 : Question 15
 * 
WAP to find string which has length more than 7characheter.
	a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”}
	b. Output :- Krishna, aakansha, abhishek
 * 
 * 
 */

public class Question15 {

	// displayStringMoreThan7Length method is used to find string which more than 7 length from given
	// array
	void displayStringMoreThan7Length(String[] stringArray) {

		for (int i = 0; i < stringArray.length; i++) {

			String str = stringArray[i];
			int strLength = str.length();

			if (strLength > 7) {

				System.out.print(stringArray[i] + " ");

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nameArray = { "Maulik", "technocredits", "", "maharashtra" };
		Question15 q5 = new Question15();
		q5.displayStringMoreThan7Length(nameArray);

	}
}
