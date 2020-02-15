/*3) WAP to Convert an ArrayList of String to a String array in Java
Input as list: [“techno”, “credits”, “pune”]
Output as array same to same: {“techno”, “credits”, “pune”}
*/

package vaishg10695.Exam;

import java.util.ArrayList;

public class Q3 {

	public static void main(String[] args) {
			ArrayList<String> al=new ArrayList<String>();
			al.add("techno");
			al.add("credits");
			al.add("pune");
			
			System.out.println("Given ArrayList: "+al);
			
			String arr[]=new String[al.size()];
			for(int i=0;i<al.size();i++)
			{
				arr[i]=al.get(i);
				System.out.print(arr[i]+" ");
			}
	}

}
