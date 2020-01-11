package amitJDec19.assignment1;
/*
 * You are given a String s, which comprises English alphabets, determine the count of all the vowels in S. Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the String s.
 * Approach:
 * There are five vowels in English alphabet. Declare variables for five integers and initialize them as 0. Traverse the String s, character by character, check if the character is vowel(here is your thinking point how you deside that character is vovel or consonants). If thet character is vowel then count++ for that particular character. As of now go with ==
 * Syntax for one example
 * If(ch == ‘a’){
 * aCnt++;
 * }else if(ch == ‘e’){
 * eCnt++;
 * }
*/
public class Question8 {
	int countOfAllVowels(String a)
	{
		int aCnt = 0;
		int eCnt = 0;
		int iCnt=0;
		int oCnt = 0;
		int uCnt = 0;
		for (int i = 0; i <a.length(); i++)
			{
				char ch = a.charAt(i);
				if (ch == 'a')
					{
						aCnt++;
					}
				else if (ch == 'e')
					{
						eCnt++;
					}
				else if (ch == 'i')
					{
						iCnt++;
					}
				else if (ch == 'o')
					{
						oCnt++;
					}
				else if (ch == 'u')
					{
						uCnt++;
					}
				else
					{
						// System.out.println(ch + " is consonant");
					}
			
			
			}
		int sum = aCnt + eCnt + iCnt + oCnt + uCnt;
				return sum;
	
	
	}

public static void main (String args[])
			{
				String s = "VodkaMartini";
				Question8 m1 = new Question8();
				int sum1 = m1.countOfAllVowels(s);
				System.out.println("Count of all the vowels in given string is: " + sum1);
			
			}
}
