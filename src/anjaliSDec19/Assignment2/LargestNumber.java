/*
 * largest and smallest number in an array
 */
package anjaliSDec19.Assignment2;

public class LargestNumber {
	
	void findLargeSmall(int[] arr)
	{
		int a=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		int b=arr.length - 1;
		System.out.println("The Smallest number is :"+ arr[0] + "The Largest number is :" + arr[b]);
	}

	public static void main(String[] args) {
		LargestNumber lsn1 = new LargestNumber();
		int[] arr= {9,5,6,3,8,2,7};
		lsn1.findLargeSmall(arr);
	}
}
