/*3) WAP to Convert an ArrayList of String to a String array in Java
Input as list: [“techno”, “credits”, “pune”]
Output as array same to same: {“techno”, “credits”, “pune”}*/
package ankitaPDec19.examprogram;

import java.util.ArrayList;

public class Ques3 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("techno");
		al.add("credits");
		al.add("pune");
		String[] ar = new String[al.size()];
		for (int i = 0; i < al.size(); i++) {
			ar[i] = al.get(i);
			System.out.print(ar[i] + " ");
		}
	}
}
