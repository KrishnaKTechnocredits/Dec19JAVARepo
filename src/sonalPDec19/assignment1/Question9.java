package sonalPDec19.assignment1;
/*
 * You are given a string S. Count the number of occurrences of all the digits in the string S
 */

public class Question9 {
	
	static void digitFreqCount(char digit, String number)
	{
		int count = 0;
		for (int i=0; i<number.length(); i++)
		{
			if(digit ==number.charAt(i))
				count++;
		}
		System.out.println("Freq of digit " + digit + " is " +count);
	}

public static void main(String[] args) {
	String number = "12288645603";
	for(int i=0; i<number.length();i++)
	{
		char ch = number.charAt(i);
		int index = number.indexOf(ch);
		if (i== index)
			digitFreqCount(ch, number);
	}
}
}
