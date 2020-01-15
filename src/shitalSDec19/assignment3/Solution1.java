/*  WAP which fulfill below condition 
 * a. WAP to find positive and negative number from the given array  
b. check the sum of individual. 
 
Input array;- {5, 6, -9, 14, -25, 6, 7, -14} 
Output :- expected output of a. positive number = {5, 6, 14, 6, 7}
b. negative number = {-9, -25, -14} 
c. positive number sum :- 38 
d. negative number sum :- 48  */

package shitalSDec19.assignment3;
import java.util.Scanner;
public class Solution1 {
	
	void findPositiveNos(int [] n)
	{		
		int arr1[] = new int[n.length];
		int arr2[] = new int[n.length];
		
		for (int i =0; i<n.length; i++)
			{
				if (n[i] >= 0)
					arr1=n;
				else 
					arr2=n;
			}
	
		System.out.println("positive numbers = " + arr1 + " negative numbers = " + arr2);		
		
	}
	public static void main(String args[])
	{
		int [] s = {5, 6, -9, 14, -25, 6, 7, -14};
		Solution1 solution1 = new Solution1();
		solution1.findPositiveNos(s);
	}
	
}
