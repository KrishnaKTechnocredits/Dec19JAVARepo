/*  Check if array contains a number in Java? 
 
Hint: Your method should accept 2 parameters. Input array and number.  i/p :-  arr[] = {2,5,9,7,4,6}  number :- 8 o/p :- number is not in arr*/

package shitalSDec19.assignment2;

public class Solution3 {
	
	void checkNumber(int num, int[] a)
	{
		boolean flag = false;
		for (int i = 0; i<a.length; i++)
			{
				for (int j=0; j<a.length;j++)
				{
					if (num ==a[i])
						flag =true;
				}
			}
		if (flag==false)
			System.out.println("The number "+ num + " is NOT present in given array");
		else
			System.out.println("The number "+ num + " is present in given array");
			
	}
	
	public static void main(String args[])
	{
		int number = 8;
		int arr[] = {2,5,9,7,4,6};
		Solution3 solution3 = new Solution3();
		solution3.checkNumber(number, arr);
		
	}

}

