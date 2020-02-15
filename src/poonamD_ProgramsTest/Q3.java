package poonamD_ProgramsTest;

/*
 * 3) WAP to Convert an ArrayList of String to a String array in Java
      Input as list: [“techno”, “credits”, “pune”]
      Output as array same to same: {“techno”, “credits”, “pune”}
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class Q3 {
	static void displayArrList()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("techno");
		list.add("credits");
		list.add("pune");
		System.out.println(list);
		System.out.print("{" );
	
		String[] arr = new String [list.size()];
			for(int i=0;i<list.size();i++) 
			{
				arr[i] = list.get(i);
				System.out.print(arr[i]+",");
			}
				System.out.print("}");
		
		}
	public static void main(String[] args)
	{
		displayArrList();
	
	}

}
