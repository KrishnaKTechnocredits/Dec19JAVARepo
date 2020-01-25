package dipaPDec19.assignment2;
/*
 * Write a java program to check the equality of two arrays
 * Hint: Input Arrays : First Array : [21, 57, 11, 37, 24] Second Array : [21, 57, 11, 37, 24] Two Arrays Are Equal
 */
public class Question6 {
	public static void main(String[] args) {
		
		int []arr1 = {21, 57, 11, 37, 24};
		int []arr2 = {21, 57, 11, 37, 24};
		equalArray(arr1,arr2);
	}

	static void equalArray(int[] a1, int[] a2) {
		
		if(a1.length == a2.length)
		{
			for(int i = 0; i < a1.length; i++)
			{
				a1[i] = a2[i];
			}
			System.out.println("Two Arrays Are Equal");
		}
		else
			System.out.println("Two Arrays Are Not Equal");
		
	}
}
