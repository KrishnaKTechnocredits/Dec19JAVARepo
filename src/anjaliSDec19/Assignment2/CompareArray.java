/*
 * WAJP to check the equality of the 2 arrays
 */
package anjaliSDec19.Assignment2;

public class CompareArray {
	
	void compareArray(int[] arr1, int[] arr2)
	{
		int cnt=0;
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]==arr2[i])
					cnt++;
			}
			if(cnt==arr1.length)
				System.out.println("Both Arrays are equal");
			else 
				System.out.println("Both Arrays contain different elements");
		}
		else
			System.out.println("Both array are of different size");
		
		
	}

	public static void main(String[] args) {
		CompareArray ca1 = new CompareArray();
		int [] arr1 = {12,25,48,94};
		int[] arr2 = {12,25,48,94};
		ca1.compareArray(arr1, arr2);
	}
}
