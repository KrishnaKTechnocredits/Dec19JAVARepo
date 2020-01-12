package ankitaPDec19.assignment2;
/*3) Check if array contains a number in Java?
Hint: Your method should accept 2 parameters. Input array and number.
i/p :- arr[] = {2,5,9,7,4,6}
number :- 8
o/p :- number is not in arr.*/

public class Solution3 {
	
	public static void main (String [] a)
	{
		int [] arr = {2,5,9,4,6};
		int num = 8;
		compare(arr,num);
	}
	static void compare(int [] a, int num)
	{   
		int flag = 1;
		for (int i = 0; i<a.length; i++)
		{
			if (num == a[i])
			{
				flag = 0;
				break;
			}
		}if (flag == 1 )
			System.out.println("The number does not exist in array " + num);
	}
}

				
