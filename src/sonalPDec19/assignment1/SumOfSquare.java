package sonalPDec19.assignment1;
/*
 * Write a program to print the sum of squares of the elements of an array of size N. 
 * N can be any integer between 1 and 100.
 */

class SumOfSquare
{
	void totalSum(int[] input)
	{
		int totalSum = 0;
		for(int i=0;i<input.length; i++)
		{
			totalSum = totalSum + (input[i]*input[i]);
		}
		System.out.println("Sum of the squares of array elements is "+totalSum);
	}
	
	public static void main(String[] a)
	{
		SumOfSquare sumofsq = new SumOfSquare();
		int[] num = new int[5];
		num[0] = 1; //1
		num[1] = 2; //4
		num[2] = 3; //9
		num[3] = 4; //16
		num[4] = 8; //64
		
		sumofsq.totalSum(num);
	}
}

