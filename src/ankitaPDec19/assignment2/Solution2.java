package ankitaPDec19.assignment2;
/*2) Find duplicate number on Integer array in Java?*/

public class Solution2 {
	public static void main(String [] args)
	{
		int [] a = {0,3,1,2,3};
			display (a);
	}
	
	static void display(int [] a)
	{
		int num = 0;
		for (int i = 0; i<a.length; i++)
		{
			for (int j = 1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					num = a[i];
					break;
				}
			} 
		}System.out.println("The duplicate number in array is " + num);
	}
	
}
				



