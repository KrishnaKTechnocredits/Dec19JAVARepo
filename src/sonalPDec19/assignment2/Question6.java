package sonalPDec19.assignment2;
/*
 * Write a java program to check the equality of two arrays? 
 * First Array : [21, 57, 11, 37, 24] 
 * Second Array : [21, 57, 11, 37, 24] 
 * O/p: - Two Arrays Are Equal 
 */

public class Question6 {
	
	static void checkEquality(int[] array1, int[] array2)
	{
		boolean flag = true;
		for(int i=0; i<array1.length; i++)
		{
			if(array1[i] != array2[i])
			{
				flag = false;
				System.out.println("Two arrays are not equal");
				break;
			}
		}
		if(flag ==true)
			System.out.println("Two arrays are equal");
	}
	
	public static void main(String[] args) {
		int[] array1 = {21, 57, 11, 37, 24};
		int[] array2 = {21, 57, 11, 37, 24};
		checkEquality(array1, array2);
	}

}
