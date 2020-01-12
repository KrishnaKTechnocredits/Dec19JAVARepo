package krantikhair;

public class TestDemo1 {
	static int evensum = 0;
	static int oddsum = 0;
	static void Display(int num)
	
	
	{
		
			if(num%2 == 0)
			{	
			evensum = evensum + num;
			
			}
			else
			{
			oddsum = oddsum + num;	
		
			}
			
		
	}
	
	public static void main(String[] args)
	{
		for(int i = 0; i<args.length;i++)
		{
		
		int num = Integer.parseInt(args[i]);
		
		TestDemo1.Display(num);
		
		}
		
				
		System.out.println("the sum of even number is" + evensum);
		System.out.println("the sum of even number is" + oddsum);
	}

}
