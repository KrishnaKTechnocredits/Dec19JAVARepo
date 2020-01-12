package ankitaPDec19.assignment2;
/*12) WAP to print common number from two different array
a. int array1 = {1, 3, 6, 9, 7}
b. int array2 = {2, 5, 6, 9, 8}
output Array :- {6, 9}*/

public class Solution12 {
	
	public static void main(String [] args)
	{
		int [] a1 = {1,3,6,9,7};
		int [] a2 = {2,5,6,9,8};
		display(a1,a2);
	}
	static void display(int [] a1, int [] a2)
	{
		for (int j = 0; j<a1.length; j++)
		{
			for (int i = 0; i<a1.length; i++)
			{
				if (a1[j] == a2[i])
				{
					System.out.println(a2[i]);
				}
			}
		}
	}

}
