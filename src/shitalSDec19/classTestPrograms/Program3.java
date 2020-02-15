//WAP to convert an ArrayList of String to a String array in Java
//Input as list: ["techno", "credits", "pune"]
//Output as array same to same: {"techno", "credits", "pune"};

package shitalSDec19.classTestPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("techno", "credits", "pune"));

		for (int i = 0; i < al.size(); i++) {
			String a = al.get(i);
			System.out.println(a);

		}

	}

}
