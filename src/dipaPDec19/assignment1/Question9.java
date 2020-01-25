package dipaPDec19.assignment1;
/* You are given a String s. "128896"
* Count the number of occurrences of all the digits in the Integer number.
*/
public class Question9 {
	static void digitFreqCount(char digit, String str)
		{
			int count = 0; //it has to be reset every time
			for(int i=0; i<str.length(); i++)
			{
				if(digit == str.charAt(i))
					count++;
			}
			System.out.println("Frequency of digit "+digit+ " is "+ count);
		}
		
	public static void main(String[] args) 
		{
			String number = "128896"; //2
			for(int i = 0;i<number.length();i++)
			{
				char ch = number.charAt(i);
				int index = number.indexOf(ch);
				if(i == index)
				digitFreqCount(ch,number);
			}
				
		}
}

