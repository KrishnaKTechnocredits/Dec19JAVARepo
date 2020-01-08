package swatiShinde30.assignment2;

/*
 * Write a java program to check the equality of two arrays? 
 */
public class Question6 
{

	static boolean flag = false;
	static void compare(int[] a1, int[] a2) 
	{
		for (int i = 0; i < a1.length; i++) 
		{
			if (a1[i] != a2[i]) 
			{
				flag = true;
		    }
		}
		if (flag == false)
		{
			System.out.println("arrays are equal");
		} else
			System.out.println("arrays are not equal");
	}

	public static void main(String[] args)
	{
		int[] array1 = { 30, 57, 11, 37, 24 };
		int[] array2 = { 21, 57, 56, 37, 24 };
		if (array1.length == array2.length) 
		{
			compare(array1, array2);
		} else
			System.out.println("arrays are not equal in size, please provide proper input");
	}

}
