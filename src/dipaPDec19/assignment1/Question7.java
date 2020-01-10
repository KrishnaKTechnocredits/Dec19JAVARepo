package dipaPDec19.assignment1;
/*
 * You are given two numbers N and M, print the absolute difference between two numbers
 */
public class Question7 {
	static int absDifference(int a, int b)
	{
		int result = 0;
		
		if(a < b)
		{
			result = (a-b) * (-1);
		}
		return result;
	}
	public static void main(String[] args) {
		
		System.out.println("The Absolute difference is "+ absDifference(-5,3));
	}

}
