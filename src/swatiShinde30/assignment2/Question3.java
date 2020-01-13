package swatiShinde30.assignment2;
/*
 *  Check if array contains a number in Java? 
 */
public class Question3
{
	static boolean flag = false;

	static void arrayNum(int digit, int[] array1) 
	{
		for (int i = 0; i < array1.length; i++) 
		{
			if (array1[i] == digit) 
			{
				flag = true;
				System.out.println("array has num " + digit);
			}
		}
		if (flag == false)
		{
			System.out.println("array not having " + digit);
		}
	}

	public static void main(String[] args)
	{
		int array1[] = { 2, 5, 9, 7, 4, 6 };
		int digit = 8;
		arrayNum(digit, array1);
	}
}
