package shivaniGDec19.lastTest;

import java.util.ArrayList;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("techno");
		al.add("credits");
		al.add("pune");
		converToString(al);
	}

	public static void converToString(ArrayList<String> al) {
		String[] string1 = new String[al.size()]; // Conversion from ArrayList
													// to String
		for (int i = 0; i < al.size(); i++) {
			string1[i] = al.get(i);
		}
		System.out.println("Converted String is: ");
		for (int i = 0; i < string1.length; i++) {
			System.out.println(string1[i] + " "); // Printing the string
		}
	}
}
