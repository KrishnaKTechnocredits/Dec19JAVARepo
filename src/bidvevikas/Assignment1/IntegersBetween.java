public class IntegersBetween {
	void listIntegers(int start, int end)
	{
		for (int i=start; i<=end; i++)
			{
				System.out.println(i);
			}
	}
	
	public static void main(String args[])
			{
				new IntegersBetween().listIntegers(5,10);
			}
}