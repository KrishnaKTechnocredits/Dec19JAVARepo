package pravinSDec19.assignment3;
/*
 * Created By : Pravin Sarda
 * Assignment 3 : Question 9
 * 
	WAP to find vowels in given string
	a. Input :- automation engineering
	b. Count :- 11
 * 
 * 
 */

public class Question8 {

	// countOvalsFromGivenString method is used to find count of Ovals in given
	// string

	void countOvalsFromGivenString(String str) {

		int ovalCount = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')
				ovalCount++;

		}

		System.out.println("Count of ovals in given string is: " + ovalCount);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "automation engineering";
		Question8 q8 = new Question8();

		q8.countOvalsFromGivenString(str);

	}
}
