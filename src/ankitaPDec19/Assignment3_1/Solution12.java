/*12) WAP to find word is palindrome or not ?
a. String name = “naman”
i. Naman is palindrome
b. String name = “harsh”
i. Harsh is not palindrome */

package ankitaPDec19.Assignment3_1;

public class Solution12 {
	static String s = "";
	public static void main(String [] args)
	{
		String name1 = "naman";
		compare(name1);
		if(name1.equals(s))
		     System.out.println("The name is pallindrome " +s);
	}
	static String compare(String name1)
	{
		for (int i = name1.length()-1; i >= 0; i--)
		{
			 s = s + String.valueOf(name1.charAt(i));
		}
		return s;
	}
}