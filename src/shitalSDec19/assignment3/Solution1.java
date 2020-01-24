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
	//int [] positive= {};
	int a=0; int b=0; int psum=0; int nsum=0;
	//int [] negative = {};
	void findPositiveNos(int [] n)
	{		
		for (int i =0; i<n.length; i++)
			{
				if (n[i] >= 0)
				//{a = n[i];
					{
					System.out.println("positive numbers = " + n[i] );
					psum = psum+ n[i];
					}
				
				else 
					//b = n[i];
				{
					System.out.println(" negative numbers = " + n[i]);
					nsum = nsum + n[i];
				}
			}
		System.out.println("sum of positive numbers : " +psum + " and sum of negative numbers : " + nsum);
	}
	public static void main(String args[])
	{
		int [] s = {5, 6, -9, 14, -25, 6, 7, -14};
		Solution1 solution1 = new Solution1();
		solution1.findPositiveNos(s);
	}
	
}
