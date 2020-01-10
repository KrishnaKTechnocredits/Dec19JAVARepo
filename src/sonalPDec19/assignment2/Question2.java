package sonalPDec19.assignment2;
/*
 * Find duplicate number on Integer array in Java? 
 * i/p :- {0, 3, 1, 2, 3}, then duplicated number is 3. 
 */

public class Question2 {
	
	static void findDuplicateNum(int[] input)
	{
		for(int i=0; i<input.length; i++)
		{
			for(int j=i+1; j<input.length; j++)
			{
				if(input[i]==input[j])
				{
					System.out.println(input[i]+" is repeated number in array.");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = {0,3,1,2,3,2};
		findDuplicateNum(array);
	}
}
