package praveenReddyDec19Assignment3;

/*
 WAP to find frequency of user defined character in user defined String 
 a. i.e. User String :- “electrical engineering” 
 b. i.e. User Char:- ‘e’ 
 c. count of e :- 5
 */

public class FrequencyQ3 {
	static String name = "electrical engineering";

	static void display()

	{
		char ch = 'e';
		int max = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ch) {
				max++;
			}

		}
		System.out.println("Frequency of " + ch + " in given array " + name + " is :" + max);
		//System.out.println(ch);
	}

	public static void main(String[] args) {
		display();
	}
}