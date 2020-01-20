package poojaRDec19.Assignment2;

//10) Find max value at differed index 

class Q10
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
					System.out.print("values are different :"+a[i]+" and "+b[i]);
					if(a[i]>b[i])
						System.out.println("  max value is "+a[i]);
					else
						System.out.println("  max value is "+b[i]);
				}
			}
			
		}
	}
	public static void main(String ar[])
	{
		Q10 q=new Q10();
		int[] a={2,5,8,9};
		int[] b={2,6,8,6};
		q.diffelement(a,b);
	}
}