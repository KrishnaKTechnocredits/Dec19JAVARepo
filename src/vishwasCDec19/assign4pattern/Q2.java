package vishwasCDec19.assign4pattern;
/*
 * 2)	1
        12
        123
        1234
        12345

 */

public class Q2
{	
	static void pattern1()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		pattern1();
	}
}
