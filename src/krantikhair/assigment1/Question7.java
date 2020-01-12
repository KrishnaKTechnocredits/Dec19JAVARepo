package krantikhair.assigment1;
class Array7
{
	
	void display(int x, int y)
		{
			int z= x-y;
			if(z < 0)
				{
				System.out.println (z*-1);
				}
			else
				{
				System.out.println (z);
				}
		}
	
	public static void main(String[] arg)
	{
	int x= 23 ; int y = 44;
	Array7 s = new Array7();
	s.display(x,y);
	
	}
}