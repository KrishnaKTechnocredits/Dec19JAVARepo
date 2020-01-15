/*
 * WAP to print unique number from 2 different arrays
not complete program
 */

package anjaliSDec19.Assignment2;

public class UniqueNumber {
	
	void findUniqueNumber(int[] arr1, int[] arr2)
	{
		int cnt=arr1.length+arr2.length, c=0;
		int[] arr3 = new int[cnt];
		if(arr1.length==arr2.length)
		{
			for(int i=0; i<arr1.length;i++)
			{
				arr3[i]= arr1[i];
			}
			
			for(int j=arr1.length; j<arr3.length;j++)
			{
				arr3[j]=arr2[j-arr1.length];
			}
			
			for(int i=0;i<arr3.length;i++)
			{
				for(int j=i+1;j<arr3.length;j++)
				{
					if(arr3[i]>arr3[j])
					{
						c=arr3[i];
						arr3[i]=arr3[j];
						arr3[j]=c;
					}
					
				}
			}
			
			
				
			System.out.print("Mergered array is : ");
			for(int i=0; i<arr3.length;i++)
			{
				System.out.print(arr3[i]+" ");
			}
			
		}
		else
			System.out.println("Both arrays are different!");
	}

	public static void main(String[] args) {
		UniqueNumber un= new UniqueNumber();
		int[] arr1= {1,3,6,9,7};
		int[] arr2= {2,5,6,9,8};
		un.findUniqueNumber(arr1, arr2);
	}
}
