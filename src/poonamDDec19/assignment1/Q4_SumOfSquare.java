package poonamDDec19.Assignment1;
/*
 * a program to print the sum of element’s squares of an array having size of N
 */
public class Q4_SumOfSquare {
	void sum(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
			{
				sum=sum+(arr[i]*arr[i]);
			}
		System.out.println("Sum of element’s squares of an array having size of " +arr.length+ " is: "+sum);		
	}
	public static void main(String[] args) 
	{
		int [] arr1 = {2,3,4,5,7};
		Q4_SumOfSquare sqr=new Q4_SumOfSquare();
		sqr.sum(arr1);
	}

}
