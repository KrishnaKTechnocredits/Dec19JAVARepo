
 //5)Write a program to list all the integers between two integers start and end(including start
and end)
class IntegersBetween1 {
	void listIntegers(int start, int end)
	{
		for (int i=start; i<=end; i++)
			{
				System.out.println(i);
			}
	
	}
		public static void main(String args[])
			{
				 IntegersBetween1 sum=new IntegersBetween1();
				sum.listIntegers(5,10);
			}
}