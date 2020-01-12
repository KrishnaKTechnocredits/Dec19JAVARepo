/*
 * Find first different index from given arrays
 */
package anjaliSDec19.Assignment2;

public class FirstDiffIndex {
	void findFirstDiffIndex(int[] arr1, int[] arr2)
	{
		
		if(arr1.length== arr2.length)
		{
			int cnt=0;
			for(int i =0; i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i] && cnt< 1)
				{
					cnt++;
					System.out.println("Difference is at index : " + i);
				}
					
			}
			if(cnt==0)
				System.out.println("Both the array are same!");
		}
		
		
	}
	public static void main(String[] args) {
		FirstDiffIndex ind= new FirstDiffIndex();
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,3};
		ind.findFirstDiffIndex(arr1, arr2);
	}
}
