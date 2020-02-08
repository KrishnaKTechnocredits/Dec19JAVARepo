/*
 * WAP to find max length String from the given array.
 *  a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”} 
 */
package poonamDDec19.Assignment3;
import java.util.Scanner;
public class Q2_MaxLength {
	static void findMaxLengthString(String[] array)
	{
		int maxLen=0;
		String maxStr ="";
		for(int i=0;i<array.length;i++)
		{
			if(array[i].length()>maxLen)
			{
				maxLen= array[i].length();
				maxStr= array[i];
			}
		}
			System.out.println("String of Max length is: "+maxStr);
	}
	public static void main(String[] args) {
		String[] str = {"all the best", "technocredits","", "maharashtra"} ;
		findMaxLengthString(str);
		
	}
}
    