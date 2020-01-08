package aparnaVDec19.assignment1;
//5. write a program to list all the integers between two integers start and end (including start and end)
//Hint
//Input : start=5 , end=10
//Output: 5 6 7 8 9 10
class AllIntegersBetweenStartNEnd
{
	void listAllInetegers(int start, int end)
	{
	    for(int i=start; i<=end;i++)
		{
		System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		AllIntegersBetweenStartNEnd l1=new AllIntegersBetweenStartNEnd();
		l1.listAllInetegers(5, 10);	//answer of this operation is 5 6 7 8 9 10
	}
}