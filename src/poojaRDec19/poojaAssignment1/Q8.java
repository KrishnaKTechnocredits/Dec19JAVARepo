package poojaRDec19.poojaAssignment1;
//8) You are given a String s, which comprises English alphabets, determine the count of all the vowels in S. Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the String s.

class Q8
{
	
	
	void m1()
	{
	    String s="technocredits"	;
		int aCnt=0;
		int eCnt=0;
		int iCnt=0;
		int oCnt=0;
		int uCnt=0;
		int totalCount=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a')
			{
				aCnt++;
				totalCount++;
			}
			else if(ch=='e')
			{
				eCnt++;
				totalCount++;
			}
			else if(ch=='i')
			{
				iCnt++;
				totalCount++;
			}
			else if(ch=='o')
			{
				oCnt++;
				totalCount++;
			}
			else if(ch=='u')
			{
				uCnt++;
				totalCount++;
			}
		}
		System.out.println("aCnt is:"+aCnt);
		System.out.println("eCnt is:"+eCnt);
		System.out.println("iCnt is:"+iCnt);
		System.out.println("oCnt is:"+oCnt);
		System.out.println("uCnt is:"+uCnt);
		System.out.println("total count is:"+totalCount);
	}
	public static void main(String args[])
	{
		Q8 c=new Q8();
		c.m1();
	}
}