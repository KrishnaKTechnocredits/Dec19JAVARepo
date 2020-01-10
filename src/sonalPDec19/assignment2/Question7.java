package sonalPDec19.assignment2;
/*
 * Find all pairs on integer array whose sum is equal to given number? 
 Input:  2, 4, 3, 5, 7, 8, 9 and Given sum:7 Integer numbers, whose sum is equal to value:7 
 Output: (2, 5)  (4, 3)
 */

public class Question7 {
	
	static void findPair(int num, int[] input)
	{
		for(int i=0; i<input.length; i++)
		{
			for(int j= i+1; j<input.length; j++)
			{
				if(input[i]+input[j]==num)
				{
					System.out.println("("+input[i]+", "+input[j]+")");
				
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] array1 = {2, 4, 3, 5, -7, 8, 14};
		int num = 7;
		findPair(num, array1);
	}

}
