/*Write a program to print the sum of element’s squares of an array having size of N. */

package shitalSDec19.assignment1;

public class Solution4 {
	void sumOfSquares(int [] a)
	{
		int sum = 0;
		for (int i =0; i<a.length; i++)
			{
				sum = sum + a[i] * a[i];
			}
			System.out.println("sum of element's squares of an array of size N is " + sum);
	}


	public static void main(String args[])
		{
			int[] num = {14,18,28,30,22};
			Solution4 solution4 = new Solution4();
			solution4.sumOfSquares(num);
		}
}
