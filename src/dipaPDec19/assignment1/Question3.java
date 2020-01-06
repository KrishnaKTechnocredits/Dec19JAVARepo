package dipaPDec19.assignment1;
/*
 * Write a program to print the sum of all the element of an array of size having N.
 */

public class Question3 {
	
	void doSum(int [] a)
	{
		int totalsum = 0;
		for(int i = 0; i < a.length; i++)
		{
			totalsum = totalsum + (a[i]);
		}
		
		System.out.println("The sum of all array elements is "+ totalsum);
	}
	
	public static void main(String [] args)
	{
		Question3 arrdyn = new Question3();
		int [] array = {6,3,8};
		arrdyn.doSum(array);
	}

}

