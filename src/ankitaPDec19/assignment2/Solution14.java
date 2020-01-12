package ankitaPDec19.assignment2;

public class Solution14 {
	
	public static void main(String [] args)
	{
		int [] a = {15, 24, 52, 49, 62, 10};
		printeven(a);
	}
	
	static void printeven(int [] s)
	{
		for (int i = 0; i<s.length;i++)
		{
			if(s[i]%2 == 0)
				System.out.println(s[i]);
		}
	}
	
}
			
			


