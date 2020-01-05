package sonalPDec19.assignment1;

//Write a program to print the sum of two integers.

class Sum
{
	
	int doSum(int x, int y)
	{
		return x+y;
	}
	
	public static void main(String[] a)
	{
		Sum sum = new Sum();
		System.out.println("Sum is "+sum.doSum(10,70));
	}
}
 