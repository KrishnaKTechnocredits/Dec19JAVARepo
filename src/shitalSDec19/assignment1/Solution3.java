/*Write a program to print the sum of all the element of an array of size having N.*/

package shitalSDec19.assignment1;

public class Solution3 {
	void sum(int [] a)
	{
	int sum = 0;
	for (int i = 0; i<a.length; i++)
		{
		sum = sum + a[i];			
		}
		System.out.println("sum of all the elements of an array of size N is " + sum);		
	}
		public static void main(String args[])
			{
			int[] array ={14,1,28};
			Solution3 solution3 = new Solution3();
			solution3.sum(array);
			}

}
