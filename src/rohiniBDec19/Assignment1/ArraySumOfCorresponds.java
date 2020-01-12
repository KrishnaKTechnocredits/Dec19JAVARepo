package rohiniBDec19.Assignment1;

/* 6) Write a program to add the corresponding elements of two arrays, each of size N and print
the sums. N can be any integer between 1 and 100. */

class ArraySumOfCorresponds
{
	void sum(int num1[],int num2[])
	{
		if(num1.length==num2.length)
		{
			for(int i=0;i<num1.length;i++)
			{
				int sum=num1[i]+num2[i];
				System.out.println("Sum of elemts at index "+i+" is "+sum);
	
			}
		}
	}
	
	public static void main(String[] args)
	{
		ArraySumOfCorresponds Arr=new ArraySumOfCorresponds();
		int[] num1=new int[5];
		num1[0]=1;
		num1[1]=20;
		num1[2]=10;
		num1[3]=12;
		num1[4]=100;
		int[] num2=new int[5];
		num2[0]=1;
		num2[1]=2;
		num2[2]=10;
		num2[3]=2;
		num2[4]=10;
		Arr.sum(num1,num2);
	}
	
}