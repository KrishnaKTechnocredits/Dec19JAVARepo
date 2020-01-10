package poojaRDec19.Assignment2;

//3) Check if array contains a number in Java? 

class Q3
{
	void num(int[] a,int b)
	{
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			if(b==a[i])
			{
				count=1;
				break;
			}
		}
		
			if(count==1)
				System.out.println(b+" is present in array");
			else
				System.out.println(b+" is not present in array");
	
		
	}
	public static void main(String ar[])
	{
		Q3 q=new Q3();
		int [] a={2,5,4,8,9};
		q.num(a,1);
	}
}