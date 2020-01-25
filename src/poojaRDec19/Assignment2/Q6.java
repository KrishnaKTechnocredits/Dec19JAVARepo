package poojaRDec19.Assignment2;

//6)Write a java program to check the equality of two arrays? 

class Q6
{
	void equal(int a[],int b[])
	{    

			int count =0;
			for(int i=0;i<a.length;i++)
			{
			
				if(a[i]!=b[i])
				{
					System.out.print("Arrays are not equal");
					count=1;
					break;
					
				}
				
			}
			if(count==0)
			System.out.print("arrays are equal");
			
	}
	public static void main(String args[])
	{
		Q6 q=new Q6();
		int a[]={1,3,5,4};
		int b[]={1,3,5,4};
		q.equal(a,b);
	}
}