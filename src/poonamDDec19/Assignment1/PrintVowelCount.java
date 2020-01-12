package poonamDDec19.Assignment1;
/*
 *  Print the count of all the vowels that are available in the String s.
 */

public class PrintVowelCount {
	void count()
	{
        int aCount=0;
        int eCount=0;
        int iCount=0;
        int oCount=0;
        int uCount=0;
		int sCount=0;
        int totalCnt=0;
        String str = "How you decide that character is vowel";
        for(int i=0;i<str.length();i++)
		{
               boolean Flag = true;
			   char ch = str.charAt(i);
            if(ch=='a')
			{
                Flag = false;
                aCount++;
            }
			else if(ch=='e')
			{
                Flag = false;
                eCount++;
            }
			else if(ch=='i')
			{
                Flag = false;
                iCount++;
            }
			else if(ch=='o')
			{
                Flag = false;
                oCount++;
            }
			else if (ch=='u')
			{
                Flag = false;
                uCount++;
            } 
			else if (ch==' ')
			{
                Flag = false;
                sCount++;
            } 			
            if(Flag == true)
            {	
            System.out.println("Character "+ch+" is Consonant ");
			
			}
			
        }
			 totalCnt= aCount+eCount+iCount+oCount+uCount;
             System.out.println("Count of all vowels is "+totalCnt);
           
    }

     public static void main(String []args)
	 {
    	 PrintVowelCount cnt=new PrintVowelCount();
    	 cnt.count();
     }
}


