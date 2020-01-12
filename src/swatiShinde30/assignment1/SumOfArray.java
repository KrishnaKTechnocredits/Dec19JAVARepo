package swatiShinde30.assignment1;
/*
Write a program to print the sum of all the elements of an array of size 4. 
*/
class SumOfArray
{
	void display(int[] d)
	{
		for(int i = 0; i<4; i++)
		{
			System.out.println("Array Element at "+ i + "th position is "+d[i]);
		}
		//System.out.println("Array size is "+d.length);
	}
	void sum(int[] s)
	{
		int total=0;
		for(int i=0; i<4; i++)
		{
			total= total+s[i];
		}
		  System.out.println("Sum of an Array element is "+total);
	}
	public static void main(String[] args)
	{
		SumOfArray sumofarray = new SumOfArray();
		int[] num = new int[4];
		num[0]=5;
		num[1]=5;
		num[2]=5;
		num[3]=5;
		sumofarray.display(num);
		sumofarray.sum(num);
	}
}