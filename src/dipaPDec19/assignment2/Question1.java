package dipaPDec19.assignment2;
/*
 * Find the missing number in integer array of 1 to 10
 */

public class Question1 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,9,10};
		missingNumber(arr);
	}

	static void missingNumber(int[] a) {
		for(int i = 0; i < a.length; i++)
		{
			if(i+1 != a[i])
			{
				System.out.println("The missing number is "+(i+1));
				break;
			}
		}
		
	}

}
