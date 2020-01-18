package poonamDPracticeTest;
/*
 * Write a program to print - 
   1. Capital letters; 2. odd number sum; 3. Special characters; 4. Even number sum; 6. small letters
   output - ABF4.[][%&2hs
 */
public class StringNumLetters {
	static void printLettersNum(String str)
	{
		String Num = "";
		String SmallLetters = "";
		String CapitalLetters = "";
		String SpclChar = "";
		int OddSum = 0 ;
		int EvenSum = 0;
		for(int i=0;i<str.length();i++)
		{ 
			char ch = str.charAt(i);
			boolean isNum = true;
			boolean isLetter = true;
			if(isNum = Character.isDigit(ch))
				{
					Num = Num + ch;
					int digit = Integer.parseInt(String.valueOf(ch));
					  if (digit % 2!=0)
					  	{
						  OddSum = OddSum + digit;                   //Odd numbers sum
					  	}
					  else
					  {
						  EvenSum = EvenSum + digit;                 // Even numbers sum
					  }
				}
			
			else if (isLetter = Character.isLetter(ch))
				{
					if (isLetter = Character.isLowerCase(ch))
						{
							SmallLetters = SmallLetters + ch;        // Small letters
						}
					else if(isLetter = Character.isUpperCase(ch))
					  	{
						  CapitalLetters = CapitalLetters + ch;      // Capital letters
					  	}
				}
			else
				{
					SpclChar = SpclChar + ch;                        // Special Characters
				}
		}
		System.out.println(" The expected output is: " + CapitalLetters+SpclChar+EvenSum+SmallLetters);
		
		/*System.out.println("Numbers in given string are: " +Num);
		System.out.println("sum of odd numbers in given string are: " +OddSum);
		System.out.println("sum of odd numbers in given string are: " +EvenSum);
		System.out.println("small Letters in given string are: " +SmallLetters);
		System.out.println("capital Letters in given string are: " +CapitalLetters);
		System.out.println("Special characters in given string are: " +SpclChar);*/
	}
	public static void main(String[] args) {
		String s= "213hs.[][$%&ABF";
		printLettersNum(s);
	}

}
