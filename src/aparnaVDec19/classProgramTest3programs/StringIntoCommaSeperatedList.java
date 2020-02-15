package aparnaVDec19.classProgramTest3programs;
/*
 * 4) WAP to Convert String into comma separated List in Java
 * Input: String = {“techno”, “credits”, “pune”}
   Output: List = [techno, credits, pune]
 */

import java.util.List;
import java.util.Arrays;

public class StringIntoCommaSeperatedList {
	public void stringIntoCommaSeperator() {

		String str = "techno credits pune";
		System.out.println("Previous String : " + str);
		String[] spaceremove = str.split(" ");
		List<String> list = Arrays.asList(spaceremove);
		System.out.println("List as follows after String to List Conversiont: " + list);
	}

	public static void main(String[] args) {
		StringIntoCommaSeperatedList strtoList = new StringIntoCommaSeperatedList();
		strtoList.stringIntoCommaSeperator();

	}
}
