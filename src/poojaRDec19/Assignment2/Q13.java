package poojaRDec19.Assignment2;

//13) WAP to reveres array 

class Q13
{
	void reverse(int[]a)
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String args[])
	{
		Q13 q=new Q13();
		int [] a={1,2,3,4,7};
		q.reverse(a);
	}
}