package krantikhair.assigment1;
class Sum
{
	
	void Add(int x,int y)
	{
		int z = x+y;
		
		System.out.println("The sum of two integer is " + z);
	}
	
	public static void main(String[] a)
	{
	int x = 5 ; int y= 8;
	Sum s = new Sum();
	s.Add(x,y);
	}
}