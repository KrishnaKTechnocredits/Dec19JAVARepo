package assignment1;
/*
 * Write a program to print the sum of two integers.
 */
public class Question1
{
	void sum(int num1, int num2)
	{
		System.out.println("Sum of two integers is "+(num1+num2));
	}
	public static void main(String[] args)
	{
 		Question1 m1=new Question1();
 		m1.sum(10, 20);
	}
}