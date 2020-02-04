package vishwasCDec19.assignment4;
/*
 * 9.	WAP to swap two numbers without using the third variable.
 */
public class Q9Swap 
{
	public static void main(String[] args)
	{

	int a=10,b=20;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("A="+a);
	System.out.println("B="+b);
}
}
