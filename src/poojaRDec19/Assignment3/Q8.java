package poojaRDec19.Assignment3;

/*8) WAP to find vowels in given string
a. Input :- automation engineering
b. Count :- 11*/

public class Q8 {
	void m1(String s) {

		int aCnt = 0;
		int eCnt = 0;
		int iCnt = 0;
		int oCnt = 0;
		int uCnt = 0;
		int totalCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a') {
				aCnt++;
				totalCount++;
			} else if (ch == 'e') {
				eCnt++;
				totalCount++;
			} else if (ch == 'i') {
				iCnt++;
				totalCount++;
			} else if (ch == 'o') {
				oCnt++;
				totalCount++;
			} else if (ch == 'u') {
				uCnt++;
				totalCount++;
			}
		}

		System.out.println("vowel count is:" + totalCount);
	}

	public static void main(String args[]) {
		String s = "automation engineering";
		Q8 q18 = new Q8();
		q18.m1(s);
	}

}
