/*You are given a String s, which comprises English alphabets, determine the count of all the vowels in S. Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the String s. */

package shitalSDec19.assignment1;

public class Solution8_2 {
	int printCount(String a)
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
						System.out.println(ch + " is consonant");
					}
			
			
			}
		int sum = aCnt + eCnt + iCnt + oCnt + uCnt;
				return sum;
	
	
	}

public static void main (String args[])
			{
				String s = "ShitalSeware";
				Solution8_2 solution8_2 = new Solution8_2();
				int sum1 = solution8_2.printCount(s);
				System.out.println("Sum of all vowels in given string is " + sum1);
			
			}
}
