package poonamDDec19.Assignment1;
/*
 *You are given a String s. Count the number of occurrences of all the digits in the Integer number 
 */

public class Program9 {
	static void digitCount(char digit,String number)
	{
		
		int count=0;
		
		for(int j=0;j<number.length();j++)
		{
			if(digit==number.charAt(j))
			count++;
		}
		System.out.println("Frequency of " +digit +" is: "+count);		
	}
	
	public static void main(String[] args)
	{
		String number="128896";
	/*  digitCount('1',number);		
		digitCount('2',number);	
		digitCount('8',number);	
		digitCount('9',number);	
		digitCount('6',number);	 */
		for(int i=0;i<number.length();i++) {
		char ch= number.charAt(i);
		int index=number.indexOf(ch);
		if(i==index)
	    digitCount(ch,number);
		System.out.println(ch+" : "+i+" : "+index);
		}

	}

}
