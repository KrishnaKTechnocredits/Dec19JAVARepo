package poonamDDec19.Assignment1;
/*
 * corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100.
 */

public class Q6_AddCorrespoElements {
		void addition (int arr1[],int arr2[])
		{
			for (int i=0;i<arr1.length;i++)
				{
					int sum=0;
					sum = sum+ (arr1[i]+arr2[i]);
					System.out.println("Sum of corresponding elements of two arrays: "+sum);
				}
		}
	public static void main(String []arg){
		int input1[] = {3, 9, 8,} ;
		int input2[] = {8, 12, 74};
		Q6_AddCorrespoElements a= new Q6_AddCorrespoElements();
		a.addition(input1,input2);
		}
	}

