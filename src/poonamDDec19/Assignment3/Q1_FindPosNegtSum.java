/*
 * 1) WAP which fulfill below condition 
 * a. WAP to find positive and negative number from the given array 
 * b. check the sum of individual
 *    Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
 */
package poonamDDec19.Assignment3;
import java.util.Scanner;
public class Q1_FindPosNegtSum {
	public static void main(String[] args)
		{
			System.out.println("Enter array size: ");
			Scanner s=new Scanner(System.in);
			int size = s.nextInt();
			int array[] = new int[size];
			int i =0;
			while(i<size) {
				System.out.println("Enter Input: ");
				array[i] = s.nextInt();
				i++;
				}
			checkPosNgtvSum(array);
		}

	 static void checkPosNgtvSum(int[] num) {
		int sumpos = 0;
		int sumngtv = 0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<0)
				{
					System.out.println("Negative numbers in given array are: "+num[i] + " ");
					sumngtv = sumngtv + num[i];
				}
			else if(num[i]>0) 
				{
					System.out.println("Positive numbers in given array are: "+num[i] + " ");
					sumpos = sumpos + num[i];
				}
		}
		System.out.println("Sum of Positive numbers in given array: "+sumpos);
		System.out.println("Sum of Negative numbers in given array: "+sumngtv);
		
	}

}
