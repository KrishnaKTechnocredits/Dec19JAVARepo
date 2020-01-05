package aparnaVDec19.assignment1;
//1. write a program to print the sum of two integers.

class Summation
{
	int addition(int x, int y)
	{
		System.out.println("Addition of two Integer numbers : "+(x+y));
		return x+y;
	}
	public static void main(String[] args)
	{
		Summation s1=new Summation();
		s1.addition(2,1);//value of this operation=2+1=3	
	}
}