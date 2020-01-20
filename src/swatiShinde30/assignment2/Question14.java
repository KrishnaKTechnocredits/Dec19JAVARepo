package swatiShinde30.assignment2;

public class Question14
{
	void evenNum(int[] array)
	{
		System.out.println("Even numbers are");
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] % 2 == 0)
				
			{
				System.out.println(array[i]);
			}
		}

	}
	public static void main(String[] args) 
	{
		Question14 q14 = new Question14();
		int[] array = { 10, 11, 13, 14, 60, 40, 31, 45, 70};
		q14.evenNum(array);
	}

}
