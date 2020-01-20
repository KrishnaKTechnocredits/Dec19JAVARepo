package poonamDDec19.Assignment1;
/*
 *  a program to print the sum of all the element of an array of size having N
 */

public class AddArrayofSizeN {
	void add(int n)
	{
		int[] arr;
		arr = new int[n];
		int val=5;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=val+i;
			sum=sum+arr[i];
		}
		System.out.println("sum of all the element of an array of size having "+n+" is "+sum);
	}
	public static void main(String[] args) {
		AddArrayofSizeN ad= new AddArrayofSizeN();
		ad.add(3);
	}

}
