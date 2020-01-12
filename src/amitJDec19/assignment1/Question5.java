package amitJDec19.assignment1;
/*
 * Write a program to list all the integers between two integers start and end(including start and end).
 * Hint:
 * Input: start = 5, end = 10
 * Output: 5 6 7 8 9 10
 */
public class Question5 {
	void listAllInetegersBetween(int start, int end)
	{
	    for(int i=start; i<=end;i++)
		{
		System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		Question5 m1=new Question5();
		m1.listAllInetegersBetween(5, 10);
	}
}
