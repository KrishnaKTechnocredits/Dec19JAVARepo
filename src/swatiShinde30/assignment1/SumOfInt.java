package swatiShinde30.assignment1;
/*
Write a program to print the sum of two integers. 
*/
class SumOfInt
{
	void Sum(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition of given integers is " +c);
	}
	public static void main(String[] a)
	{
		SumOfInt sumofint = new SumOfInt();
		sumofint.Sum(5,5);
	}
}