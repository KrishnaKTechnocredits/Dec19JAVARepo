
package rohiniBDec19.Assignment1;

/*3) Write a program to print the sum of all the element of an array of size having N.
Hint:
Input: int []array = {6, 3, 8,}
Output: 17*/

class ArraySum2
{
	
	void sum(int[] input)
	{
		int total=0;
		for(int i=0;i<input.length;i++)
		{
			total=total+input[i];
		}
		System.out.println("Sum of elements is: "+ total);
	}
	
	public static void main(String[] args)
	{
		int[] num =new int[3];
		num[0]=6;
		num[1]=3;
		num[2]=8;
	    ArraySum2 ex =new ArraySum2();
		ex.sum(num);
	}
	
}
