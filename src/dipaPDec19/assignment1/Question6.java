package dipaPDec19.assignment1;
/*
 * Write a program to add the corresponding elements of two arrays, each of size N and print the sums.
 *  N can be any integer between 1 and 100. 
 */

public class Question6 {
	void arrSum(int[] a, int[] b)
	{
		int sum [] = new int[a.length];
		if(a.length == b.length)
		{
			for(int i = 0; i<a.length;i++ )
			{
				sum[i] = a[i] + b[i];
				System.out.print(sum[i]+" ");
			}
		}
		else
			System.out.println("Array length is mismatched");
	}
	
	public static void main(String[] args) {
		
		Question6 arrAdd = new Question6();
		int x [] = {3, 9, 8,};
		int y [] = {8, 12, 74};
		arrAdd.arrSum(x,y);
	}

}
