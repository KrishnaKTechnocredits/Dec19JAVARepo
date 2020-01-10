package poojaRDec19.poojaAssignment1;
/*2) Write a program to print the sum of all the elements of an array of size 4.
 * 
 */
class Q2
{
	int[] a=new int[4];
	int i;
	int total;
	void m1()
	{
		
		a[0]=5;
	    a[1]=10;
	    a[2]=15;
	    a[3]=2;
		for (i=0;i<4;i++)
		{
			 total=total+a[i];
		}
		System.out.println("Sum is:="+total);
	}
	public static void main(String args[])
	{
		Q2 arraySum=new Q2();
		arraySum.m1();
		
	}
	
}