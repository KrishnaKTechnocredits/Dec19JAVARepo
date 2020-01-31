/*  WAP to find max length String from the given array. 
 * a. Input array:- {“all the best”,“technocredits”, “”, “maharashtra”} */

package shitalSDec19.assignment3;
import java.util.Scanner;
public class Solution2 {
	void findMaxLengthString(String [] arr)
	{ 
		String b="";
		int maxLength=0;
		for (int i=0; i<arr.length; i++)
		{
			String s = arr[i];
			String [] a = s.split(",");
			int length = arr[i].length();
			if (maxLength <  length)
			{
				maxLength = length;
				b = arr[i];
			}
			
		}
		System.out.println("output max length string is " + b +" and its length is " + maxLength);
	}

	public static void main(String[] args) {
		String[] input = {"all the best", "technocredits", "", "maharashtra"};
		Solution2 solution2 = new Solution2();
		solution2.findMaxLengthString(input);
		
	}
}
