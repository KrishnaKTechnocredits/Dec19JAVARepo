package yashashrikDec19.Assignment1;

/*1) Write a program to print the sum of two integers.*/

class SumQ1
{
	int total=0;
	void doSum(int a,int b)
	{
		total= a+b;
		System.out.println(total);
	}
	public static void main(String args[])
	{
		SumQ1 sum=new SumQ1();
		sum.doSum(4,5);
	}
}
