package dipaPDec19.assignment1;
/*
 * Write a program to print the sum of element’s squares of an array having size of N.
 */

public class Question4 {
	
	void sumOfSquare(int [] a)
	{
		int totalsum = 0;
		for(int i =0; i < a.length; i++)
		{
			totalsum = totalsum +(a[i] * a[i]);
		}
		System.out.println("The sum of elements square is "+totalsum);
	}
	
	public static void main(String [] args)
	{
		Question4 arrsqr = new Question4();
		int [] arr = {4,7,2,8,5};
		arrsqr.sumOfSquare(arr);
	}

}
