package poojaRDec19.Assignment2;

//4) Largest and smallest number in unsorted array? 

class Q4
{
	void largeSmall(int []a)
	{
		int large=a[0];
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
				large=a[i];
			else if(a[i]<small)
				small=a[i];
		}
		System.out.println(large+"  is larger element");
		System.out.println(small+"  is asmaler element");
	}
	public static void main(String ar[])
	{
		Q4 q=new Q4();
		int a[]={1,2,6,3,6,4,2};
		q.largeSmall(a);
	}
}