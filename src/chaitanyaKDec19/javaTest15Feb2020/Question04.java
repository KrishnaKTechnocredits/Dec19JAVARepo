package chaitanyaKDec19.javaTest15Feb2020;

import java.util.ArrayList;

/*
 * WAP to Convert String into comma separated List in Java
 * Input: String = {“techno”, “credits”, “pune”}
 * Output: List = [techno, credits, pune]
 */

public class Question04 {

	public static void main(String[] args) {

		// Declaring array of type String
		String[] string = { "techno", "credits", "pune" };

		System.out.println("Given input is: ");
		for (String name : string) {
			System.out.println(name);
		}
		// Calling method to convert/store strings in to a List
		convertToList(string);
	}

	private static void convertToList(String[] inputString) {

		// Declaring new ArrayList
		ArrayList<String> stringList = new ArrayList<String>();

		// Getting each string from input string and adding it to the list
		for (String name : inputString) {
			stringList.add(name);
		}

		// Printing arraylist
		System.out.println("Output is in the list format is: ");
		System.out.println(stringList);
	}

}
