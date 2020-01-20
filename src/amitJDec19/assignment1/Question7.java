package amitJDec19.assignment1;
/*
 * You are given two numbers N and M, print the absolute difference between two numbers
 * i.e.
 * Approach:
 * Therefore, if the value is negative, then make it positive by multiplying it with −1. Print out the value of result.
 */
public class Question7 {
	 void absoluteDifference(int x, int y)
		{
			int result=x-y;
			if(result<0)
			{
				result=result*(-1);
			}                           
			System.out.println(result);	
		}
		public static void main(String[] args)
		{
			Question7 m1=new Question7();
			m1.absoluteDifference(2,12);
		}
}
