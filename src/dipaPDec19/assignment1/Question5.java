package dipaPDec19.assignment1;
/*
 * Write a program to list all the integers between two integers start and end(including start and end).
 */

public class Question5 {
	
	void listing(int start, int end)
	{
		for(int i =start; i<= end; i++)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		
		Question5 list = new Question5();
		list.listing(5,10);
	}
}
