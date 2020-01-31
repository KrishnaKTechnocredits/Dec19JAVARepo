package vishwasCDec19.assign4pattern;
/*
 * 1)	A
        AB
        ABC

 */

public class Q1 
{
	public static void main(String args[])
	{
		int abc=65;
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)abc);
			}
			System.out.println();
			abc++;
		}
	}
}
