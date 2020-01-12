package dipaPDec19.assignment1;
/*
 * Write a program to print the sum of all the elements of an array of size 4.
 */

public class Question2 {
	
	void sum (int[] input)
	{
		int finalsum = 0;
		for(int i = 0; i < input.length; i++)
		{
			finalsum = finalsum + input[i];
		}
		System.out.println("The Sum of all 4 elements of an array is "+finalsum);	
	}
	
	public static void main(String [] args)
	{
		Question2 ad = new Question2();
		int [] num = new int [4];
		num [0] = 10;
		num [1] = 20;
		num [2] = 30;
		num [3] = 80;
			
		ad.sum(num);	
	}

}
