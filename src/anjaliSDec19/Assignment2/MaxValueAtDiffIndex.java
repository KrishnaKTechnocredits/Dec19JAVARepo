/*
 * Find max value at differed index
 */
package anjaliSDec19.Assignment2;

public class MaxValueAtDiffIndex {

	void findMaxAtDifferedIndex(int[] arr1, int[] arr2)
	{
		if(arr1.length== arr2.length)
		{
			int cnt=0;
			for(int i =0; i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i] && cnt< 1)
				{
					cnt++;
					System.out.println("Values are not matching at index : " + i);
					if(arr1[i]>arr2[i])
						System.out.println("From ("+arr1[i]+","+arr2[i]+") max value is" + arr1[i]);
					else 
						System.out.println("From ("+arr1[i]+","+arr2[i]+") max value is " + arr2[i]);
				}
					
			}
			if(cnt==0)
				System.out.println("Both the array are same!");
		}
	}
	public static void main(String[] args) {
		MaxValueAtDiffIndex max =new MaxValueAtDiffIndex();
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,13};
		max.findMaxAtDifferedIndex(arr1, arr2);
	}
}
