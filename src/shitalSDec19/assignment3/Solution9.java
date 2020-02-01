/*  WAP to find average of user given array 
 * a. Input :- {14, 32, 19, 14, 78,36}
b. Output:- 32.16  */

package shitalSDec19.assignment3;

public class Solution9 {
	double avg = 0;
	int sum =0;
	double findAvg(int [] arr)
	{
		for (int i = 0; i<arr.length; i++)
		{			
			sum = sum + arr[i];
			
		}
		avg = avg + (double) sum/arr.length;
		return avg;
	}
		
	public static void main(String[] args) {
		int[] nos = {14, 32, 19, 14, 78, 36};
		Solution9 solution9= new Solution9();
		double avgNos = solution9.findAvg(nos);
		System.out.println(avgNos);
	}
}
