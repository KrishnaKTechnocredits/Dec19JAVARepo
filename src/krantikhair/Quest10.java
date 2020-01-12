package krantikhair;

public class Quest10 {
	void differ() {
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		int temp = 0;

		for (int index1 = 0; index1 <= arr1.length - 1; index1++) {
			if (arr1[index1] != arr2[index1])
			{
				System.out.println("Differ index is " + index1);
				temp = index1;
				//System.out.println("value of temp is " + temp);
			}
		}

		
		if (arr1[temp] > arr2[temp])

		{
			System.out.println("Max value is " + arr1[temp]);
		} else
			System.out.println("Max value is " + arr2[temp]);

	}

		public static void main(String[] args)
		{
			Quest10 m = new Quest10();
			m.differ();

		}
	
}
