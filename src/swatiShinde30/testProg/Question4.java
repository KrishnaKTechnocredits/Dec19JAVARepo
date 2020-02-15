package testProg;

import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		String[] str = { "techno", "credits", "pune" };
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {

			al.add(str[i]);
		}
		System.out.println(al);
	}
}
