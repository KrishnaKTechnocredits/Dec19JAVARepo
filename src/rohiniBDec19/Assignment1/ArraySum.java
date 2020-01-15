
package rohiniBDec19.Assignment1;

/*2) Write a program to print the sum of all the elements of an array of size 4.*/

class ArraySum
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
		int[] num =new int[4];
		num[0]=1;
		num[1]=2;
		num[2]=10;
		num[3]=2;
	    ArraySum ex =new ArraySum();
		ex.sum(num);
	}
	
}
