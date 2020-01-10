/*You are given a String s. Count the number of occurrences of all the digits in the Integer number. Input:  128896 Output:   1 -> 1,  2 -> 1,  6 -> 1,  8 -> 2,  9 -> 1 Approach:   First think you will write on method which check whether this number is come for first time or not. If number come for the first time then you need to call method which increase the count of that particular number*/

package shitalSDec19.assignment1;

public class Solution9 {
	
	void digitFreqCount(char ch, String s)
	{
		int count =0;
		
		for (int i=0; i<s.length(); i++)
		{
			if (ch ==s.charAt(i))
				count++;
			
			
		}
		System.out.println("The digit " + ch + " is occurring " + count + " times");
		
		
		
	}
	
	public static void main(String args[])
	{
		String s = "128896";
		
		Solution9 solution9 = new Solution9();
		for (int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if (i==s.indexOf(ch))		//Here index of i is compared to index of character and if it matches, occurence printing is skipped.
				solution9.digitFreqCount(ch, s);
			
		}
		
		
	}

}
