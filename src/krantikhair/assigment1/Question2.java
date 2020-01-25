package krantikhair.assigment1;
class Array1
{
	
	void display(int a[])
		{
			
			for(int i=0; i<a.length; i++)
			{
			System.out.println(a[i]);
			}
		}
	void call(int a[])
		{
			int Totalsum = 0;
			for(int i=0; i<a.length; i++)
			{
				Totalsum = Totalsum + (a[(i)]);
		
			}
			System.out.println("Total sum is" + ":" + Totalsum);
		}	
		
	
	public static void main(String[] arg)
	{
	 int a[]= {10,20,30,40};
	Array1 s = new Array1();
	s.display(a);
	s.call(a);
	}
}