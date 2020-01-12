package amitJDec19.assignment1;
/*
 *Write a program to print the sum of all the element of an array of size having N.
 *Hint:
 *Input: int []array = {6, 3, 8,}
 *Output: 17
 */

public class Question3 {
	void sumArrayAnySize(int [] num)
	{
	int sum = 0;
	for (int i = 0; i<num.length; i++)
		{
		sum = sum + num[i];			
		}
		System.out.println("Sum of all the element of an array of size having N is: " + sum);		
	}
		public static void main(String args[])
			{
			int[] array ={6,3,8};
			Question3 m1 = new Question3();
			m1.sumArrayAnySize(array);
			}
}
