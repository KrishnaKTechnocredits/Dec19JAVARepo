package dipaPDec19.finalJavaTest;

import java.util.ArrayList;

/*
 * 4) WAP to Convert String into comma separated List in Java
	Input: String = {“techno”, “credits”, “pune”}
	Output: List = [techno, credits, pune]
 */
public class Question4 {
	public static void main(String[] args) {
		Question4 que4 = new Question4();

		que4.converStringToList(); // method call
	}

	void converStringToList() {
		String[] str = { "techno", "credits", "pune" };

		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			al.add("" + str[i]);
		}

		System.out.print("Converted arraylist is " + al);
	}
}
