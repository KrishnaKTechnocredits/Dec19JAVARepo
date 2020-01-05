
/* Write a program to print the sum of all the elements of an array of size 4. */

package shitalSDec19.assignment1;

public class Solution2 {
	void sum(int[] a)
	{
		int sum=0;
		for (int i=0; i<a.length; i++)
			{
				sum = sum + a[i];
			}
		System.out.println("sum of all the elements of an array of size 4 is " + sum);		
	}
	public static void main(String args[])
	{
		int[] elements = new int[4];
		elements[0]=10;
		elements[1]=20;
		elements[2]=30;
		elements[3]=40;
		Solution2 solution2 = new Solution2();
		solution2.sum(elements);
	
	}

}
