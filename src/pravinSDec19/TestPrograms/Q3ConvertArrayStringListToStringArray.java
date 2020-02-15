package pravinSDec19.TestPrograms;

import java.util.ArrayList;
/*
 * 3) WAP to Convert an ArrayList of String to a String array in Java
	Input as list: [“techno”, “credits”, “pune”]
	Output as array same to same: {“techno”, “credits”, “pune”}
 * 
 * 
 */

public class Q3ConvertArrayStringListToStringArray {

	static String[] convertArrayListToArray(ArrayList<String> alStr) {

		String[] arrayStr = new String[alStr.size()];
		int index = 0;
		for (String str : alStr) {

			arrayStr[index] = str;
			index++;

		}

		return arrayStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alStr = new ArrayList<String>();
		alStr.add("techno");
		alStr.add("credits");
		alStr.add("pune");

		String[] strArray = convertArrayListToArray(alStr);

		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}

	}

}
