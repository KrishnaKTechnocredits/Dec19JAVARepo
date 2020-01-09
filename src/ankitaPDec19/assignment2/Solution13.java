package ankitaPDec19.assignment2;

public class Solution13 {
	
	public static void main(String [] args)
	{
		int [] arr = {5, 6, 9, 10, 14, 63};
		reverse(arr);	
	}
	
	static void reverse(int [] arr)
	{
		int [] ans = new int [arr.length];
		int num = 0;
		for (int j = arr.length-1; j >= 0 ; j--)
		{
			num = arr[j];
			for(int i = 0; i<ans.length; i++)
			{
				ans [j] = num;
				
			}
			System.out.println(ans[j]);
		}
		
	}
}














