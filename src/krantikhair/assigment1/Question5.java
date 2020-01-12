package krantikhair.assigment1;
class Number1
{
	
	void display(int x,int y)
		{
			
			for(int i=x; i<=y; i++)
			{
			System.out.println(i);
			}
		}
	
		
	
	public static void main(String[] arg)
	{
	int a = 5; int b= 10;
	Number1 s = new Number1();
	s.display(a,b);
	
	}
}