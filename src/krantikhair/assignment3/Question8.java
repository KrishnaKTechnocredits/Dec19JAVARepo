/*
 * 8) WAP to find vowels in given string  a. Input :- automation engineering b. Count :- 11 
 */

package krantikhair.assignment3;

public class Question8 {
	static int aCnt = 0;
	static int eCnt = 0;
	static int iCnt = 0;
	static int oCnt = 0;
	static int uCnt = 0;

	static void Switch(char ch) {
		switch (ch) {
		case 'a':
			aCnt++;
			break;
		case 'e':
			eCnt++;
			break;
		case 'i':
			iCnt++;
			break;
		case 'o':
			oCnt++;
			break;
		case 'u':
			uCnt++;
			break;

		}

	}

	public static void main(String[] args) {
		String s = "aedfgrtaieoiuuo";
		for (int i = 0; i < s.length(); i++) {

			Switch(s.charAt(i));

		}
		System.out.println("The total vowels present in the string is " + (aCnt + eCnt + iCnt + oCnt + uCnt));

	}

}
