package ankitaPDec19.assignment2;
/*8) Find first differ index from given arrays
i/p :- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,13}
o/p :- Values are not matching at index -> 2*/

public class Solution8 {
	public static void main(String [] args)
	{
		int [] a1 = {10,2,9,14,3};
		int [] a2 = {10,2,18,14,13};
		display(a1,a2);
	}
	
	static void display(int [] a1, int [] a2)
	{
		int c = 0;
		for (int i = 0;i<a1.length; i++)
		{
			if(a1[i] != a2[i])
			{
				c = i;
				break;
			}
	    }System.out.println("The value is different at index ->" + c);
	}
}
	


