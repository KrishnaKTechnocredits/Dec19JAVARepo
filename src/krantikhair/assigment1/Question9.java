package krantikhair.assigment1;
/*
 * when number occurs multiple time 
 * indexOf and charAt is very important here.
 */
public class Question9 
{
	static void display(char digit,String number)
	{
		
		
		int count = 0;
		for (int i = 0; i < number.length(); i ++)
			{
			if(digit==number.charAt(i))
			count++;
			}          
		System.out.println ("frequency of digit " + digit + " is " +  count);
	}
	
	
	public static void main(String[] args) 
	{
		String number = "1112228899966688";

		for(int i = 0; i<number.length();i++)
		{
			char ch = number.charAt(i);
			int ind = number.indexOf(ch);
			if (ind==i)
			{
				display(ch, number);
			}
		}
	}
	
}