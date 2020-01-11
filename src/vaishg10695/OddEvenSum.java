package vaishg10695;

class OddEvenSum
{
	static int evensum=0;
	static int oddsum=0;
	static void sum(int a )
	{
		
		
			if(a%2==0)
			{
				evensum=evensum+a;
			}
			else 
			{
				oddsum= oddsum+a;
			}
		
	

	}
		
	public static void main( String [] args)
	{
		for(int i=0;i<args.length;i++)
		{
		int arg= Integer.parseInt(args[i]);
		sum(arg);
		}
			System.out.println("even number sum is: "+evensum);
		System.out.println("odd number sum is: "+oddsum);
	}

}