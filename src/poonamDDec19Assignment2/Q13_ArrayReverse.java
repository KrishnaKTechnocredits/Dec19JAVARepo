package poonamDDec19Assignment2;
/*
 *  WAP to reveres array
 */

public class Q13_ArrayReverse {
	static void findReverseArray(int [] arr)
	{
		for (int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+ " ");
		}
		
	
	}
	public static void main(String[] args)
	{
		int[] input= {5,6,9,10,14,63};
		findReverseArray(input);
	}

}
 