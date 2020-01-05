package poojaRDec19.poojaAssignment1;

class ArrayAdd
{  int c;
	void operation(int[]ar,int[]br)
	{
		for(int i=0;i<ar.length;i++)
		{
         	c=ar[i]+br[i];
			System.out.println(c);
		}
		
	}
	public static void main(String args[])
	{
		ArrayAdd arrayAdd=new ArrayAdd();
		int a[]={3,5,4};
		int b[]={6,5,8};
	    arrayAdd.operation(a,b);
	}
	
}