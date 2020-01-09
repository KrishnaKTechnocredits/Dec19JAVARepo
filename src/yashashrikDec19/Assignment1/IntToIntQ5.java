package yashashrikDec19.Assignment1;
/*5) Write a program to list all the integers between two integers start and end(including start and end).
Hint:
Input: start = 5, end = 10
Output: 5 6 7 8 9 10*/

class IntToIntQ5
{

	void startEnd(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			System.out.println("Numbers between 5 and 10 are" +i);
		}
	}
	public static void main(String args[])
	{
		IntToIntQ5 inttoint=new IntToIntQ5();
		inttoint.startEnd(5,10);
		
	}

}