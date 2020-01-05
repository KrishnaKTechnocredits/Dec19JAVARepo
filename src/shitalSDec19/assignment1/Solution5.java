/*Write a program to list all the integers between two integers start and end(including start and end). */

package shitalSDec19.assignment1;

public class Solution5 {
	void listIntegers(int start, int end)
	{
		for (int i=start; i<=end; i++)
			{
				System.out.println(i);
			}
	
	}
		public static void main(String args[])
			{
				Solution5 solution5 = new Solution5();
				solution5.listIntegers(5,10);
			}
}
