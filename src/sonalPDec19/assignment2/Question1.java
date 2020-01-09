package sonalPDec19.assignment2;
/*
 *  Find the missing number in integer array of 1 to 10? 
 */

public class Question1 {

	static void findMissingNum(int[] input)
	{
		int j=0;
		for(int i=0; i<input.length; i++)
			{
				if(input[i] != (j+1))
				{
					System.out.println((j+1) + " is a missing number in given array.");
					i--;
				}
				j++;
			}
	}
	public static void main(String[] args) {
		int[] array = {1,2,4,5,8,9,10};
		findMissingNum(array);
	}

}
