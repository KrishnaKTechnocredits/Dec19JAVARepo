package amitJDec19.assignment1;
/*
 * Write a program to print the sum of element’s squares of an array having size of N.
 * Hint:
 * Input: int[] array = 4 7 2 8 5
 * Output: 158
 */
public class Question4 {
	void sumArraySquares(int [] a)
	{
		int sum = 0;
		for (int i =0; i<a.length; i++)
			{
				sum = sum + a[i] * a[i];
			}
			System.out.println("Sum of element’s squares of an array having size of N is: " + sum);
	}


	public static void main(String args[])
		{
			int[] num = {4,7,2,8,5};
			Question4 m1 = new Question4();
			m1.sumArraySquares(num);
		}
}
