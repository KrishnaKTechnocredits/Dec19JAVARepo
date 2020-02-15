package pravinSDec19.TestPrograms;

import java.util.ArrayList;
import java.util.List;
/*
	4) WAP to Convert String into comma separated List in Java
	Input: String = {“techno”, “credits”, “pune”}
	Output: List = [techno, credits, pune]
 * 
 * 
 */

public class Q4ConvertArrayStringToList {

	static List<String> convertArrayToArrayList(String[] strArray) {

		List<String> strList = new ArrayList<String>();

		for (int i = 0; i < strArray.length; i++) {

			strList.add(strArray[i]);

		}

		return strList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = { "techno", "credits", "pune" };
		List<String> alStr = new ArrayList<String>();

		alStr = convertArrayToArrayList(strArray);
		System.out.println(alStr);

	}

}
