/*You are given two numbers N and M, print the absolute difference between two numbers */

package shitalSDec19.assignment1;

public class Solution7_1 {
	void difference(int a, int b)
	{
		int diff = a-b;
			if (diff > 0)
				{
					System.out.println("The absolute difference between two numbers is " + diff);						
				}
			else
				{
					diff = diff * -1;
					System.out.println("The absolute difference between two numbers is " + diff);
				}
	
	}

	public static void main(String args[])
		{
			Solution7_1 solution7_1 = new Solution7_1();
			solution7_1.difference(100, 20);	
		}
}
