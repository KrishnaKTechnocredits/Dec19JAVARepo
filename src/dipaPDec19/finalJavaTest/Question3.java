package dipaPDec19.finalJavaTest;
/* WAP to Convert an ArrayList of String to a String array in Java
	Input as list: [“techno”, “credits”, “pune”]
	Output as array same to same: {“techno”, “credits”, “pune”}
 */

import java.util.ArrayList;
public class Question3 {
	public static void main(String[] args) {
		Question3 que3 = new Question3();
		que3.convertTOArray();
	}
	void convertTOArray() //convert list to array
	{
		String str = "";  //temporary string array
		ArrayList<String> al = new ArrayList<String>();
		al.add("techno");
		al.add("Creadit");
		al.add("pune");
		System.out.println(al);
		System.out.print("{"); //starting curly braces
		for(int i = 0; i < al.size(); i++)
		{
			 str =  al.get(i);
			 System.out.print(str+ " ");
		}
		System.out.println("}"); //ending curly braces
	}
}
