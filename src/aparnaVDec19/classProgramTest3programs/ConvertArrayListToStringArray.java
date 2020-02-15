package aparnaVDec19.classProgramTest3programs;

/* 3) WAP to Convert an ArrayList of String to a String array in Java
	Input as list: [“techno”, “credits”, “pune”]
	Output as array same to same: {“techno”, “credits”, “pune”}
 */
import java.util.ArrayList;

public class ConvertArrayListToStringArray {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("techno");
		list.add("credits");
		list.add("pune");
		System.out.println("ArrayList is as : " + list);
		System.out.print("{");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
		System.out.print("}");
	}
}
