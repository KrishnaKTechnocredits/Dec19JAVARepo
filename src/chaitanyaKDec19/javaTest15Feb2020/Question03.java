package chaitanyaKDec19.javaTest15Feb2020;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * WAP to Convert an ArrayList of String to a String array in Java
 * Input as list: [“techno”, “credits”, “pune”]
 * Output as array same to same: {“techno”, “credits”, “pune”}
 */

public class Question03 {

	public static void main(String[] args) {

		// Declaring Array List
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("techno", "credits", "pune"));

		System.out.println("Given list is: " + stringList);

		// Calling method to get values from list and store them in String array
		convertToString(stringList);
	}

	private static void convertToString(ArrayList<String> inputStringList) {

		String[] convertedString = new String[inputStringList.size()];

		// Method to get value from each index of list
		// and storing in string and then printing it
		System.out.println("Output is: ");
		for (int i = 0; i < convertedString.length; i++) {

			convertedString[i] = inputStringList.get(i);
			System.out.println(convertedString[i]);
		}
	}

}
