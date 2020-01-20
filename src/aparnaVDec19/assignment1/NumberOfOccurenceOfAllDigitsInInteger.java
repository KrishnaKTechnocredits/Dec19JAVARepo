package aparnaVDec19.assignment1;
/*
 *9)You are given a String s. Count the number of occurrences of all the digits in the Integer
number.
Input: 128896
Output: 1 -> 1, 2 -> 1, 6 -> 1, 8 -> 2, 9 -> 1
Approach: First think you will write on method which check whether this number is
come for first time or not. If number come for the first time then you need
to call method which increase the count of that particular number.
 */
public class NumberOfOccurenceOfAllDigitsInInteger {
	
	static void digitFreqCount(char digit, String number)
	{
		int count=0;
		for(int i=0;i<number.length();i++)
		{
			if(digit==number.charAt(i))
				count++;
		}
		System.out.println("Freq of Digit "+ digit+ " is =" + count);	
	}
	
	public static void main(String[] args) {
		String number="122889624137";
		number.indexOf('8');//indexOf method returns -1 when char is not present in String
		for(int i=0;i<number.length();i++)
		{
			//digitFreqCount(number.charAt(i), number);
			char ch=number.charAt(i);
			int index=number.indexOf(ch);
			//System.out.println(ch + ":" + i + ":" + index);
			if(i==index)
			digitFreqCount(ch, number);
		}
	}

}
