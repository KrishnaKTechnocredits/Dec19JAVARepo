package krantikhair.assigment1;
class Array6
{
	
	void display(int a[],int b[])
		{
			
			for(int i=0; i<a.length && i<b.length; i++)
			{
			System.out.println(a[i]+ b[i]);
			}
		}
	
	public static void main(String[] arg)
	{
	 int a[]= {10,20,30,40};
	 int b[]= {10,20,30,40};
	Array6 s = new Array6();
	s.display(a,b);
	
	}
}