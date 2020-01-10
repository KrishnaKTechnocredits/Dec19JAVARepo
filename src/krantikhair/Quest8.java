package krantikhair;

public class Quest8 {
	
	void differ() {
		
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		for (int Index1 = 0; Index1 < arr1.length; Index1++)
		{
			if (arr1[Index1] != arr2[Index1])//Checking arrays values are not same
			{
				System.out.println("Values are not matching at index : " + Index1);
			}
		}

	}

	public static void main(String[] args)
	{
		Quest8 f = new Quest8();
		f.differ();
	}

}
