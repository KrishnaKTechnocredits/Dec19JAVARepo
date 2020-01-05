/*Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100. 1≤N≤100 */

package shitalSDec19.assignment1;

public class Solution6 {
	void Add(int[] a, int[] b)
	{
		int add = 0;
			if (a.length == b.length)
				{
					for (int i =0; i<a.length; i++)
						{
							add = a[i] + b[i];
							System.out.println("Sum of corresponding elements of two arrays is " + add);
						}
				}
			else 
				System.out.println("array length is mismatch");
						
	}
	
	public static void main(String args[])
		{
			int[] array1 = {3,9,8};
			int[] array2 = {8,12,74};
			Solution6 solution6 = new Solution6();
			solution6.Add(array1, array2);
			
		
		}
}
