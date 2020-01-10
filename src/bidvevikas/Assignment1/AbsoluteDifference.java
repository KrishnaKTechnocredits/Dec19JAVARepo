 //7)You are given two numbers N and M, print the absolute difference between two numbers
 class AbsoluteDifference {
	void difference(int a, int b)
	{
		int diff = a-b;
			if (diff > 0)
				{
					System.out.println("The absolute difference between two numbers is " + diff);						
				}
			else
				{
					diff = diff * -1;
					System.out.println("The absolute difference between two numbers is " + diff);
				}
	
	}

	public static void main(String args[])
		{
			AbsoluteDifference AbsoluteDifference = new AbsoluteDifference();
			AbsoluteDifference.difference(0,-20);	
		}
}