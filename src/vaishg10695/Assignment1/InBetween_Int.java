
/*5) Write a program to list all the integers between two integers start and end(including start and end).
	Hint:  
	Input:    start = 5, end = 10 
	Output:   5 6 7 8 9 10 */

package vaishg10695.Assignment1;

class InBetween_Int
{

	void InBetween_Integer (int start, int end)
	{
		
		for(int i=start;i<=end;i++)
			
		 System.out.print(i + " ");

		/*System.out.print("integers between" + start "and" + end "are:" + i + " ");*/
	}
	
	
	public static void main(String[] args)
	{
		InBetween_Int IB=new InBetween_Int();
		
		IB.InBetween_Integer(5,10);
	}	
}


