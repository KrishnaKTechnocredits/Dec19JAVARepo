/* Write a java program to find second largest element in an array of integers?  */

package shitalSDec19.assignment2;
public class Solution5 {
	void largestNumber(int [] a)
	{
		int largest = a[0];
		int secondLargest = a[0];
			for (int i=0; i<a.length; i++)
			{
				if (largest < a[i])
					secondLargest = largest;
					largest = a[i];
			}
			System.out.println("The largest number is " +largest);
				System.out.println("The second largest number is " +secondLargest);
	}
	public static void main(String args[])
	{
		int arr[]= {2,6,3,9,11};
		Solution5 solution5 = new Solution5();
		solution5.largestNumber(arr);
	}

}

