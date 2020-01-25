package yashashrikDec19.Assignment1;

class Vowels8
{
	void getVowelCount(String str)
	{
		int aCnt=0;
		int eCnt=0;
		int iCnt=0;
		int oCnt=0;
		int uCnt=0;
		int finalCnt=0;
		for(int i=0;i<=str.length();i++)
		{
			char ch=str.charAt(i);	
			if(ch=='a')
			{
				aCnt++;
			}else if(ch=='e')	
				{
					eCnt++;		
				}else if(ch=='i')
					{
						iCnt++;		
					}else if(ch=='o')
					{
						oCnt++;		
					}else if(ch=='u')
					{	
						uCnt++;		
					}
		}
		finalCnt=aCnt+eCnt+iCnt+oCnt+uCnt;
		System.out.println(finalCnt);
}

	public static void main(String args[])
	{
		Vowels8 vowel=new Vowels8();
		vowel.getVowelCount("Yashashri");
	}
}