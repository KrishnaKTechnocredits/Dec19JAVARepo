
package rohiniBDec19.Assignment1;

/*1) Write a program to print the sum of two integers*/


class SumOfTwoInteger
{
	int Sum(int a,int b)
	{
		int TotalSum=a+b;
		return TotalSum;
	}
	
	public static void main(String[] args)
	{
		SumOfTwoInteger s1 = new SumOfTwoInteger();
		int TotalSum=s1.Sum(20,30);
		System.out.println("Sum of two integer is: "+ TotalSum);
	}
}