/*
 * 15) WAP to find string which has length more than 7characheter. 
 * a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”} 
 * b. Output :- Krishna, aakansha, abhishek
 */

package poonamDDec19.Assignment3;
import java.util.Scanner;
public class Q15_MaxLengthStr {
	public static void strLenChar(String[] arr)
	{	
		int len = 7;
		String output = "";
		for(int i=0;i<arr.length;i++)
			{
				if(arr[i].length()>=len)
				{
					output = arr[i];
					System.out.print(output +", ");
				}
			}
	}
	public static void main(String[] args)
	{
		String[] a= {"krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek"};
		strLenChar(a);
	}

}
