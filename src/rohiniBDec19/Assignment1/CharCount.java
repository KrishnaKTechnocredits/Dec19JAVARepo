package rohiniBDec19.Assignment1;

/*9) You are given a String s. Count the number of occurrences of all the digits in the Integer
number.
Input: 128896
Output: 1 -> 1, 2 -> 1, 6 -> 1, 8 -> 2, 9 -> 1*/


class CharCount
{
	static void counts(char ch,String s)
	{
		int cnt=0;
		  for(int i=0;i<s.length();i++)
		  {
			if(ch==s.charAt(i))
		    cnt++;
		  
		  }
		  System.out.println("Count of "+ch+" is --> "+cnt);
	}
	
  public static void main(String[] args)
	{
	
		String num="128896";
		for(int i=0;i<num.length();i++)
		{  
	            char ch = num.charAt(i);
				int index =num.indexOf(ch);
				if(i==index)
				counts(ch,num);

		}
		
	}
}