package dipaPDec19.assignment1;
/*
 * You are given a String s, which comprises English alphabets, determine the count of all the vowels in S. 
 * Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the String s.
 */
public class Question8 {
	
	void vowelCount(String str)
	{
		int aCnt = 0;
		int eCnt = 0;
		int iCnt = 0;
		int oCnt = 0;
		int uCnt = 0;
		int totalCnt = 0;
		
		for(int i = 0; i<str.length();i++ )
		{
			char ch = str.charAt(i);
			if(ch == 'a')
			{
				aCnt++;
				totalCnt++;
			}
			else if(ch == 'e')
			{
				eCnt++;
				totalCnt++;
			}
			else if(ch == 'i')
			{
				iCnt++;
				totalCnt++;
			}
			else if(ch == 'o')
			{
				oCnt++;
				totalCnt++;
			}
			else if(ch == 'u')
			{
				uCnt++;
				totalCnt++;
			}
		}
		System.out.println("a = "+aCnt);
		System.out.println("e = "+eCnt);
		System.out.println("i = "+iCnt);
		System.out.println("o = "+oCnt);
		System.out.println("u = "+uCnt);
		System.out.println("Total count of vowels in the given String is  "+totalCnt);
	}
	public static void main(String [] args)
	{
		Question8 arrVo = new Question8();
		String str1 = "dipapillayjfhsklfeaeheseflaaiuuuosaussi";
		
		arrVo.vowelCount(str1);
	}

}
