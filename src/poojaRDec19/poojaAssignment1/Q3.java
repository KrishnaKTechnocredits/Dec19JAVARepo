package poojaRDec19.poojaAssignment1;
//3) Write a program to print the sum of all the element of an array of size having N. 
class Q3
{

	void m1(int []ar)
	{	int total=0;
		for(int i=0;i<ar.length;i++)
		{
			total=total+ar[i];
		}
		System.out.println(total);
	}
	public static void main(String args[])
	{
		Q3 arraySum2=new Q3();
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		arraySum2.m1(a);
	}
	
}