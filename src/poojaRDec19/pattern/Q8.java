package poojaRDec19.pattern;
/*
 * 1) Draw below pattern
 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * *
  * * *
   * *
    *
    
     
 */
public class Q8 {

	void m1(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			System.out.print(" *");
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
		}
	}
	public static void main(String[] args) {
		Q8 q8=new Q8();
		q8.m1(5);
}
}