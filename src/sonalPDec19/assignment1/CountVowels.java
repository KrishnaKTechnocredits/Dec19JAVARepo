package sonalPDec19.assignment1;
/*
 * You are given a string S, which comprises English alphabets, determine the count of all the vowels in S. Vowels are [a,e,i,o,u]. 
 *Print the count of all the vowels that are available in the string S.
 */

class CountVowels
{
	void doCount(String s)
	{
		int aCnt = 0;
		int eCnt = 0;
		int iCnt = 0;
		int oCnt = 0;
		int uCnt = 0;
		for(int i =0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch == 'a')
			{
				aCnt++;
			}
			else if(ch == 'e')
			{
				eCnt++;
			}
			else if(ch == 'i')
			{
				iCnt++;
			}
			else if(ch == 'o')
			{
				oCnt++;
			}
			else if(ch == 'u')
			{
				uCnt++;
			}
		}
		System.out.println("Vowel 'a' count = "+aCnt);
		System.out.println("Vowel 'e' count = "+eCnt);
		System.out.println("Vowel 'i' count = "+iCnt);
		System.out.println("Vowel 'o' count = "+oCnt);
		System.out.println("Vowel 'u' count = "+uCnt);
	}
	
	public static void main(String[] a)
	{
		CountVowels cntvowels = new CountVowels();
		cntvowels.doCount("Technocredit");
	}	
}