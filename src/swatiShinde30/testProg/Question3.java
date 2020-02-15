package testProg;

import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("techno");
		al.add("credits");
		al.add("pune");
		System.out.println(al);

		String[] str = new String[al.size()];
		System.out.print("{");
		for (int i = 0; i < al.size(); i++) {

			System.out.print(str[i] = al.get(i) + " ");
		}
		System.out.print("}");
	}

}
