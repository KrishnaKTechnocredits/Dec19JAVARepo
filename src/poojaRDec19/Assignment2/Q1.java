package poojaRDec19.Assignment2;
//1) Find the missing number in integer array of 1 to 10?

class Q1
{
	void missing(int[] a)
	{
		int count=0;
		int i;
		for( i=0;i<a.length;i++)
		{
			if((i+1)!=a[i])
			{
				count =1;
				break;
			}
			
		}
		System.out.println("missing element: "+(i+1));
		
	}
	public static void main(String ar[])
	{
		Q1 q=new Q1();
		int[] a={1,2,3,4,5,7,8,9,10};
		q.missing(a);
	}
}