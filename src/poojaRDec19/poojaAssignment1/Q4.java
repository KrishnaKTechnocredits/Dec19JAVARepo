package poojaRDec19.poojaAssignment1;

class Q4
{
	

	void m1(int []ar)
	{	int total=0;
	    int c=0;
		for(int i=0;i<ar.length;i++)
		{
			c=ar[i]*ar[i];
			
			total=total+c;
		}
		System.out.println(c);
	}
	public static void main(String args[])
	{
		Q4 arraySquare=new Q4();
		int a[]=new int[4];
		a[0]=20;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		arraySquare.m1(a);
	}
}