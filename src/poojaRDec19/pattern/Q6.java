package poojaRDec19.pattern;
/*
*
**
***
****
*****
****
***
**
*

 */
public class Q6 {
	void m1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}for(int i=1;i<=n-1;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}
	public static void main(String[] args) {
		Q6 q6=new Q6();
		q6.m1(5);

	}

}
