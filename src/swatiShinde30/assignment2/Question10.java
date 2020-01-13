package swatiShinde30.assignment2;

/*
 *  Find max value at differed index 
 */
public class Question10 
{

	static void DifferIndex(int[] arr1, int[] arr2) 
	{
		for (int i = 0; i < arr1.length; i++)
		{
			if (arr1[i] != arr2[i])
			{
				System.out.println("differ index is " + i);
				if (arr1[i] > arr2[i]) {
					System.out.println("Max number is " + arr1[i]);
				} else
					System.out.println("Max number is " + arr2[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 13 };
		DifferIndex(arr1, arr2);
	}

}
