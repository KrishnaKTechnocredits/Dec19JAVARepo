package programsTest;

import java.util.ArrayList;

/*
 * 3) WAP to Convert an ArrayList of String to a String array in Java
	

Input as list: [“techno”, “credits”, “pune”]
	

Output as array same to same: {“techno”, “credits”, “pune”}*/

public class ArrayToString {

	void displayString()
	{
		ArrayList<String> arraylist= new ArrayList<String>();
		arraylist.add("techno");
		arraylist.add("credits");
		arraylist.add("pune");
		System.out.println(arraylist);
		System.out.print("{");
		for(int i=0;i<arraylist.size();i++)
		{
			String output=arraylist.get(i);
			System.out.print(" "+output);
		}
		System.out.print("}");
		
	}
	public static void main(String[] args) {
		ArrayToString a1=new ArrayToString();
		a1.displayString();
	}
}
