//WAP to convert String into comma separated List in Java
//Input: String = {"techno", "credits", "pune"}
//Output: [techno, credits, pune]

package shitalSDec19.classTestPrograms;

import java.util.Arrays;
import java.util.LinkedList;

public class Program4 {

	static String[] s = { "techno", "credits", "pune" };

	public static void main(String[] args) {
		LinkedList ll = new LinkedList(Arrays.asList(s));
		System.out.println(ll);

	}
}
