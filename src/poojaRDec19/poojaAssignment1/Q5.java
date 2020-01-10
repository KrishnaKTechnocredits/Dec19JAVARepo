package poojaRDec19.poojaAssignment1;
//5) Write a program to list all the integers between two integers start and end(including start and end). 
class Q5
{
	void m1(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			System.out.println(i);
	
		}
	}
	public static void main(String args[])
	{
		Q5 listInteger=new Q5();
		listInteger.m1(40,60);
		
	}
}