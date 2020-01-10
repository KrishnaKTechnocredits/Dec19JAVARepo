package pravinSDec19.assignment1;

/*
 * Created By: Pravin Sarda
 * Assignment 1 - Question 8
	 You are given a String s, which comprises English alphabets, determine the count of all the vowels in S. Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the String s.
	Approach:
	There are five vowels in English alphabet. Declare variables for five integers and initialize them as 0. Traverse the String s, character by character, check if the character is vowel(here is your thinking point how you deside that character is vovel or consonants). If thet character is vowel then count++ for that particular character. As of now go with ==
	Syntax for one example
	If(ch == ‘a’){
	aCnt++;
	}else if(ch == ‘e’){
	eCnt++;
	}
 * 
 */

public class Question8 {

	void count(String str) {

		char ch;
		int aCnt = 0;
		int eCnt = 0;
		int iCnt = 0;
		int oCnt = 0;
		int uCnt = 0;

		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);

			if (ch == 'a' || ch == 'A') {
				aCnt++;
			} else if (ch == 'e' || ch == 'E') {
				eCnt++;

			} else if (ch == 'i' || ch == 'I') {
				iCnt++;

			} else if (ch == 'o' || ch == 'O') {
				oCnt++;

			} else if (ch == 'u' || ch == 'U') {
				uCnt++;

			}
		}

		System.out.println("Vowel A/a is appears " + aCnt + " times in provided String");
		System.out.println("Vowel E/e is appears " + eCnt + " times in provided String");
		System.out.println("Vowel I/i is appears " + iCnt + " times in provided String");
		System.out.println("Vowel O/o is appears " + oCnt + " times in provided String");
		System.out.println("Vowel U/u is appears " + uCnt + " times in provided String");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abceFJErOv";

		Question8 cnt = new Question8();
		cnt.count(s);

	}
}
