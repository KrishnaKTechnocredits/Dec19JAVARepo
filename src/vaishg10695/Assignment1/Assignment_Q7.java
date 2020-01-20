 /*7) You are given two numbers N and M, print the absolute difference between two numbers 
Approach: 
Therefore, if the value is negative, then make it positive by multiplying it with −1. Print out the value of result.*/

package vaishg10695.Assignment1;

class  Assignment_Q7
{

	void difference(int a, int b)
	{
		int diff = a-b;
			if (diff > 0)
				{
					System.out.println("The absolute difference between two numbers is " + diff);						
				}
			else
				{
					diff = diff * -1;
					System.out.println("The absolute difference between two numbers is " + diff);
				}
	
	}

	public static void main(String args[])
		{
			Assignment_Q7 s7 = new Assignment_Q7();
			s7.difference(500, 600);	
		}
}
