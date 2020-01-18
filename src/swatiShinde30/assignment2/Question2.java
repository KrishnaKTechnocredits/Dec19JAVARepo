package swatiShinde30.assignment2;

/*
 * Find duplicate number on Integer array in Java? 
 */
public class Question2
{
	static void repeated(int digit, int[] number) 
	{
			for (int i=0; i < number.length; i++) 
		{
			for (int j = i + 1; j <number.length; j++) 
			{
				if (number[i] == number[j]) 
				{
					System.out.println("duplicate num is "+number[i]);
				}
			}
	    }
     }
	public static void main(String[] args)
	{
		int number[] = { 0, 3, 1, 2, 3 ,1};
		int digit=0;
		for (int i = 0; i < number.length; i++) 
		{
			digit = number[i];
		}
		repeated(digit, number);
	}
	
}
