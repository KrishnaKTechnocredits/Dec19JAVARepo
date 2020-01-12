package poojaRDec19.Assignment2;

//9) Find all differ index from given arrays 

class Q9
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
					System.out.println("values are different :"+a[i]+" and "+b[i]);
					
				}
			}
			
		}
	}
	public static void main(String ar[])
	{
		Q9 q=new Q9();
		int[] a={2,5,8,9};
		int[] b={2,6,8,6};
		q.diffelement(a,b);
	}
}
