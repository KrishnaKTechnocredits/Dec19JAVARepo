package poonamDDec19.Assignment1;
/*
 *  a program to print the sum of all the element of an array of size having N
 */

public class Q3_AddArrayofSizeN {
	void add(int[] arr)
		{
			int sum=0;
			for(int i=0;i<arr.length;i++)
				{
					sum=sum+arr[i];
				}
				System.out.println("Sum of all the element of an array of size " +arr.length+" is: "+sum);
		}
	public static void main(String[] args) 
		{
			int [] arr1 = {2,3,4,5,7};
			Q3_AddArrayofSizeN ad= new Q3_AddArrayofSizeN();
		    ad.add(arr1);
		}

}
