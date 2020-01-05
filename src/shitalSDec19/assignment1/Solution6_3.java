/*Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100. 1≤N≤100 */

package shitalSDec19.assignment1;

public class Solution6_3 {
	void Add(int[] a, int[] b)
	{
			if (a.length == b.length)
				{
					for (int i =0; i<a.length; i++)
						{
							System.out.println("Sum of corresponding elements of two arrays is " + (a[i] + b[i]));
						}
				}
			else 
				System.out.println("array length is mismatch");
						
	}
	
	public static void main(String args[])
		{
			int[] array1 = {3,9,8,4};
			int[] array2 = {8,12,74};
			Solution6_3 solution6_3 = new Solution6_3();
			solution6_3.Add(array1, array2);
			
		
		}
}
