/*
 * You are given a string S. Count the number of occurrences of all the digits in the string S.
  */
class Question9 
{
	
		//Static String number;
		static void digitFreqCount(char digit,String number)	
		{
			//System.out.println(digit);	
			int count=0;
			for(int i=0;i<number.length();i++)
			{
				if(digit==number.charAt(i))
				{
					count++;
				}			
			}
			System.out.println("Frequency of Digit "+ digit + " is " +count);		
		}
		public static void main(String[] args) 
		{
			String number = "128896";
			number.indexOf('8'); 
			for(int i=0;i<number.length();i++)
			{
				char ch=number.charAt(i);
				int index=number.indexOf(ch);
				if(i==index)
				digitFreqCount(ch,number);
			}	
		}	
	}