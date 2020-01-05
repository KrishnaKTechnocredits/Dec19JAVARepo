package aparnaVDec19.assignment1;
//8. You are given a String S, which Comprises English alphabets, determine the count of all the vowels in S.Vowels are [a,e,i,o,u].Print the count of 
//all the vowels that are available in the String S.
//This is the First Approach:-
class PrintVowelsInString
{
	String str="consequentially unobjectionable multimillionaire";
	void  vowelsCount()
	{
      int aCnt=0;
		int eCnt=0;
		int iCnt=0;
		int oCnt=0;
		int uCnt=0;
		int totalcnt=0;
		
		for(int j=0;j<str.length();j++)
		{
			char ch= str.charAt(j);
			if(ch=='a')
			{
				aCnt++;
				totalcnt++;
			}
			else if(ch=='e')
			{
				eCnt++;
				totalcnt++;
			}
			else if(ch=='i')
			{
				iCnt++;
				totalcnt++;
			}
			else if(ch=='o')
			{
				oCnt++;
				totalcnt++;
			}
			else if(ch=='u')
			{
				uCnt++;
				totalcnt++;
			}
		}
	  System.out.println("Count of Vowel a = "+aCnt);
      System.out.println("Count of Vowel e = "+eCnt);  
      System.out.println("Count of Vowel i = "+iCnt);  
      System.out.println("Count of Vowel o = "+oCnt);  
      System.out.println("Count of Vowel u = "+uCnt);  		
	  System.out.println("Count of Total Vowels = "+totalcnt); 		
	}
	
	public static void main(String[] args)
	{
		PrintVowelsInString pv=new PrintVowelsInString();
		pv.vowelsCount();
	}
}