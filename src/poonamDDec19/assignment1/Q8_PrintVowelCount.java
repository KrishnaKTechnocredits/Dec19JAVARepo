package poonamDDec19.Assignment1;
/*
 *  Print the count of all the vowels that are available in the String s.
 */

public class Q8_PrintVowelCount {
	void count()
	{
        int aCount=0;
        int eCount=0;
        int iCount=0;
        int oCount=0;
        int uCount=0;
        int totalCnt=0;
        String str = "How you decide that character is vowel";
        for(int i=0;i<str.length();i++)
			{
			   char ch = str.charAt(i);
            if(ch=='a')
			{
                aCount++;
            }
			else if(ch=='e')
			{
                eCount++;
            }
			else if(ch=='i')
			{
                iCount++;
            }
			else if(ch=='o')
			{
                oCount++;
            }
			else if (ch=='u')
			{
                uCount++;
            }  
			
        }
			 totalCnt= aCount+eCount+iCount+oCount+uCount;
             System.out.println("Count of all vowels is "+totalCnt);
           
    }

     public static void main(String []args)
	 {
    	 Q8_PrintVowelCount cnt=new Q8_PrintVowelCount();
    	 cnt.count();
     }
}


