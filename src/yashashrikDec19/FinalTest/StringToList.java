package programsTest;

import java.util.ArrayList;

/*
4) WAP to Convert String into comma separated List in Java

Input: String = {“techno”, “credits”, “pune”}
	

Output: List = [techno, credits, pune]
*/
public class StringToList {

	public static void main(String[] args) {
		String s[]= {"techno","credits","pune"};
		ArrayList<String> arraylist=new ArrayList<String>();
		for(int i=0;i<s.length;i++)
		{
				arraylist.add("" +s[i]);
		}
		System.out.println(arraylist);
	}
}
