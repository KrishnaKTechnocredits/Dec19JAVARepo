package poonamDDec19.Assignment1;
/*
 * a program to print the sum of element’s squares of an array having size of N
 */
public class SumOfSquare {
	void sum(int n)
	{
		int[] arr;
		arr = new int[n];
		int val=3;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=val+i;
			sum=sum+(arr[i]*arr[i]);
		}
		System.out.println("sum of element’s squares of an array having size of "+n+" is "+sum);		
	}
	public static void main(String[] args) {
		SumOfSquare sqr=new SumOfSquare();
		sqr.sum(3);
	}

}
