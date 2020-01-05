package sonalPDec19.assignment1;
/*
 * You are given a string S. Count the number of occurrences of all the digits in the string S
 */

public class Question9 {
	static void digitFreqCount(char digit, String number)
	{
		int count = 0;
		for(int i=0; i<number.length(); i++)
		{
			if(digit == number.charAt(i))
				count++;
		}
		System.out.println("Freq of digit "+digit + " is "+count);
	}
	
	public static void main(String[] a)
	{
		String number = "128896";
		digitFreqCount('1', number);
		digitFreqCount('2', number);
		digitFreqCount('8', number);
		digitFreqCount('9', number);
		digitFreqCount('6', number);
	}
}

