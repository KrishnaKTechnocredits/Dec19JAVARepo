/* Find all pairs on integer array whose sum is equal to given number? 
 
Hint: You have given an integer array and a number, you need to write a program to find all elements in the array whose sum is equal to the given number. Remember, the array may contain both positive and negative numbers, so your solution should consider that. Input:2, 4, 3, 5, 7, 8, 9 Given sum:7 Integer numbers, whose sum is equal to value:7 (2, 5)  (4, 3)  */

package shitalSDec19.assignment2;

public class Solution7 {
	
		void findSumOfArray(int sum, int[] d) 
		{
			for (int i = 0; i<d.length-5; i++)
			{
				for (int j=0; j<d.length;j++)
				{
					int output = d[i]+d[j];
					if ( sum== output)
						System.out.println("The pairs are " + d[i] + "&" + d[j]);
				}
			}
		}
		public static void main(String args[])
		{
			int[] num = {2, 4, 3, 5, 7, 8, 9};
			int sum = 7;
			Solution7 solution7 = new Solution7();
				solution7.findSumOfArray(sum, num);
		}
}
