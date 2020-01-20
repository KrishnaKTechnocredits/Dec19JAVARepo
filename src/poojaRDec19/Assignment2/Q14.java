package poojaRDec19.Assignment2;

//14) WAP to print even number from the array 

class Q14
{
	void reverse(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			System.out.println(a[i]);
		}
	}
	public static void main(String args[])
	{
		Q14 q=new Q14();
		int [] a={1,2,3,4,7};
		q.reverse(a);
	}
}