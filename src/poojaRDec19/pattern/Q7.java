package poojaRDec19.pattern;
/*
      *
     **
    ***
   ****
  *****
 ******
*******
 ******
  *****
   ****
    ***
     **
      *
       

 */
public class Q7 {
	void m(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			System.out.print("*");
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{   
			for(int j=1;j<=i;j++)
			System.out.print(" ");
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
	}

	public static void main(String[] args) {
		Q7 q7=new Q7();
		q7.m(7);
		
		
	}

}
