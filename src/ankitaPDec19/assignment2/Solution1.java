package ankitaPDec19.assignment2;

public class Solution1 {
	static int num;
	static int ans;
	
	static void display(int num)
	{
		    int flag = 0;
			for (int j = 1; j <= 10; j++)
			{
				if (j == num)
				{
					flag = 1;
				     break;
				}if (flag == 0)
					System.out.println("The missing number is" + j);
			}
				
		}
	public static void main(String [] args)
	{
		int [] arr = {2,3,4,1,6,8,9,10};
		for (int i = 0; i<arr.length; i++)
		{
			num = arr[i];
			display(num);
		}
		
	}
	
}
	











		
