package sameerDDec19.assignment1;
/*
*
*Write a program to list all the integers between two integers L and R (including L and R). L and R can be any integer between 1 and 100. 1≤L,R≤100.
*
*/
class Integers
{
	public static void main(String[] args)
	{
		Integers a1=new Integers();
		a1.display(5,10);
	}
	void display(int L,int R)
	{
		
		for(int i=L;i<=R;i++)
		{
			System.out.println(i);
		}
		
	}
}