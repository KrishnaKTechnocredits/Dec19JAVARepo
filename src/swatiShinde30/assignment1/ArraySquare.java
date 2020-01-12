package swatiShinde30.assignment1;
/*
 Write a program to print the sum of element’s squares of an array having size of N. 
*/
class ArraySquare
	{
		int sum;
		void aSquare(int[] s)
			{
				for(int i = 0; i<s.length; i++)
					{
						sum = sum +(s[i]*s[i]);
					}
				System.out.println("Sum of the square of array numbers is" + sum);
			}
		public static void main(String[] args)
			{
				ArraySquare arraysquare = new ArraySquare();
				int[] num = new int[5];
				num[0] = 2;
				num[1] = 5;
				num[2] = 2;
				num[3] = 2;
				num[4] = 2;
				arraysquare.aSquare(num);
			}
	}