package swatiShinde30.assignment2;
/*
 *  WAP to print common number from two different array 
 */
public class Question12 
{

	static void common(int[] array1, int[] array2)
	{
		for (int i = 0; i < array1.length; i++) 
		{
			if (array1[i] == array2[i])
			{
				System.out.println("common numbers are " + array1[i] + " " + array2[i]);
			}
		}
	}

	public static void main(String[] args) 
	{
		int[] array1 = { 1, 3, 6, 9, 7 };
		int[] array2 = { 2, 5, 6, 9, 8 };

		common(array1, array2);

	}

}
