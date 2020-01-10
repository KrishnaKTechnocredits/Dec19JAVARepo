package poojaRDec19.Assignment2;

//2) Find duplicate number on Integer array in Java? 

class Q2
{
	void duplicate(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==(a[j]))
				{
					System.out.println(a[j]+" is duplicate element");
					break;
				}
		       
			}
		}
	}
	public static void main(String ar[])
	{
		Q2 q=new Q2();
		int a[]={1,2,6,3,6,4,2};
		q.duplicate(a);
	}
}