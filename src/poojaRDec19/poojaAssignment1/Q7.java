package poojaRDec19.poojaAssignment1;
//7) You are given two numbers N and M, print the absolute difference between two numbers 

class Q7
{
	void m1(int a, int b)
	{  
	    int c=a-b;
		if(c<0)
			c=c*-1;
		System.out.println(c);
	}
	public static void main(String args[])
	{
		Q7 d=new Q7();
		d.m1(56,35);
	}
}