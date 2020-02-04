package poojaRDec19.Assignment4;
/*Write a Java program to print the sum (addition), 
 * multiply, subtract, divide and remainder of two numbers
 */

public class Q1 {
	void sum(int a,int b)
	{
		int addition=a+b;
		System.out.println("addition is : "+addition);
	}
	void mult(int a,int b)
	{
		int multipication =a*b;
		System.out.println("multipication is : "+multipication);
	}
	void sub(int a,int b)
	{
		int substraction =a-b;
		System.out.println("substraction is : "+substraction);
	}
	void div(int a,int b)
	{
		int division =a/b;
		System.out.println("division is : "+division);
	}
	void reminder(int a,int b)
	{
		int rem=a%b;
		System.out.println("reminder is : "+rem);
	}

	public static void main(String[] args) {
		Q1 q1=new Q1();
		int a=10,b=20;
		q1.sum(a,b);
		q1.sub(a,b);
		q1.mult(a,b);
		q1.div(a,b);
		q1.reminder(a,b);
		
	}

}
