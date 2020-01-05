
/*1) Write a program to print the sum of two integers.*/

package vaishg10695.Assignment1;

class Sum
{
	
	void calculate(int a, int b)
	{
		System.out.println("sum of 2 integer number is: "+ (a+b));
	}
	
	public static void main(String [] args)
	{
		Sum s=new Sum();
		s.calculate(10,20);
	}
}