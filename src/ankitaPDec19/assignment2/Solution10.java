package ankitaPDec19.assignment2;
/*10) Find max value at differed index
i/p:- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,3}
o/p :- Values are not matching at index -> 2
From (9,18) max value is 18*/

public class Solution10 {
	public static void main(String [] args)
	{
		int [] a1 = {10,2,9,14,3};
		int [] a2 = {10,2,18,14,3};
		for (int i = 0;i<a1.length; i++)
		{
			if(a1[i] != a2[i])
			{
				System.out.println("The value is different at index ->" + i);
				display(a1[i],a2[i]);
			}
		}
	}
	static void display(int a1, int a2)
	{
		if(a1>a2)
			System.out.println("The max value between " + a1 + "," + a2 + " is " + a1);
		else
			System.out.println("The max value between " + a1 + "," + a2 + " is " + a2);
	}
	
}
				

			
			
		
