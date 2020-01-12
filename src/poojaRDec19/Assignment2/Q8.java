package poojaRDec19.Assignment2;

//8) Find first differ index from given arrays 

class Q8
{
	void diffelement(int []a,int []b)
	{
		int count=0,i;
		if(a.length==b.length)
		{
			for(i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					count=1;
					break;
				}
			}
			System.out.println(a[i]);
		}
	}
	public static void main(String ar[])
	{
		Q8 q=new Q8();
		int[] a={2,5,8,9};
		int[] b={2,6,8,6};
		q.diffelement(a,b);
	}
}