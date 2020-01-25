package sonalPDec19.assignment1;

/*
 * Write a program to list all the integers between two integers L and R (including L and R).
 * L and R can be any integer between 1 and 100.
 */

class ListIntegers
{
	
	void doList(int start, int end)
	{
		for(int i=start; i<=end; i++)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] a)
	{
		ListIntegers listint = new ListIntegers();
		listint.doList(2,8);
	}
}
