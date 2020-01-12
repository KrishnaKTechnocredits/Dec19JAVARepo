package amitJDec19.assignment1;
/*
 * Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100. 1≤N≤100
 * Hint:
 * Input: int input1[] = {3, 9, 8,}
 *        int input1[] = {8, 12, 74}
 *        Output: 11 21 82
 */
public class Question6 {
	void addTwoElemenstsArray(int[] a, int[] b)
	{
		int add = 0;
			if (a.length == b.length)
				{
					for (int i =0; i<a.length; i++)
						{
							add = a[i] + b[i];
							System.out.println("Add of elements of two arrays, each of size N is: " + add);
						}
				}
			else 
				System.out.println("array length is mismatch");
						
	}
		public static void main(String args[])
			{
				int[] array1 = {3,9,8};
				int[] array2 = {8,12,74};
				Question6 m1 = new Question6();
				m1.addTwoElemenstsArray(array1, array2);
			}

	}
