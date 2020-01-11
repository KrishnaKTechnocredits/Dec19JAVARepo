
package rohiniBDec19.Assignment1;

/* 4) Write a program to print the sum of element’s squares of an array having size of N.
Hint:
Input: int[] array = 4 7 2 8 5
Output: 158 */


class ArraySumOfSquares
{
	
	void sum(int[] input)
	{
		int total=0;
		for(int i=0;i<input.length;i++)
		{
			total=total+(input[i]*input[i]);
		}
		System.out.println("Sum of squares of an element is: "+ total);
	}
	
	public static void main(String[] args)
	{
		int[] num =new int[5];
		num[0]=4;
		num[1]=7;
		num[2]=2;
		num[3]=8;
		num[4]=5;
	    ArraySumOfSquares ex =new ArraySumOfSquares();
		ex.sum(num);
	}
	
}
