/*
 * WAP to add the corresponding elements of 2 array, each of size n and print the sum. n can be integer from 1 to 100
 */
package anjaliSDec19.Assignment1;

public class AddTwoArray {
	void addTwoArrayElements(int[] arr1, int[] arr2)
	{
		
		if(arr1.length==arr2.length)
		{
			if (arr1.length>=1 && arr1.length<=100)
			{
				int[] arr3= new int[arr1.length];
				for (int i=0;i<arr1.length;i++)
				{
					arr3[i]=arr1[i]+arr2[i];
				}
				
				System.out.print("Addition of elements of 2 array is :");
				for(int i=0;i<arr3.length;i++)
				{
					System.out.print(arr3[i] + " ");
				}
			}
			else
				System.out.println("Length of array is not between 1 to 100!");
		}
		else 
			System.out.println("Length of both array is not same!");
	}
	
	public static void main(String[] args) {
		AddTwoArray add1 = new AddTwoArray();
		int[] arr1 = {3,9,8};
		int[] arr2 = {8,12,74};
		add1.addTwoArrayElements(arr1, arr2);
	}

}
