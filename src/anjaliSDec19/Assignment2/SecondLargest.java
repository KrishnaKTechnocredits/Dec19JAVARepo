/*
 * WAJP to find second largest element in an array of integer
 */
package anjaliSDec19.Assignment2;

public class SecondLargest {

	void findSecondLargest(int[] arr)
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
			int b=arr.length - 2;
			System.out.println("The second largest number in the array is :" + arr[b]);
		}
	
	public static void main(String[] args) {
		SecondLargest sl1= new SecondLargest();
		int[] arr= {7,48,9,15,36};
		sl1.findSecondLargest(arr);
	}
}
