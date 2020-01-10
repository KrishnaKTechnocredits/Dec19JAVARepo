package poojaRDec19.Assignment2;

//12) WAP to print common number from two different array 

class Q12
{
void diffelement(int []a,int []b)
	{
		int i;
		if(a.length==b.length)
		{
			for(i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
				{
					System.out.println(a[i]+"  is unique in both arrays");
				}
			}
			
		}
	}
	public static void main(String ar[])
	{
		Q12 q=new Q12();
		int[] a={2,5,8,9};
		int[] b={7,6,8,6};
		q.diffelement(a,b);
	}
}