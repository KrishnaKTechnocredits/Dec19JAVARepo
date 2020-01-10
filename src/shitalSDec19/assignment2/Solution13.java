/* WAP to reveres array a. int inputArray = {5, 6, 9, 10, 14, 63} b. outputArray = {63, 14, 10, 9, 6, 5} */

package shitalSDec19.assignment2;

public class Solution13 {
	void reverseArray(int [] array)
	{
		for (int i =array.length-1; i>=0; i--)
		{
			System.out.println("reverse array is "+ array[i]);
			
		}
		
		
		
	}
	public static void main(String args[])
	{
		int [] inputArray = {5, 6, 9, 10, 14, 63};
		Solution13 solution13 = new Solution13();
		solution13.reverseArray(inputArray);
		
	}

}
