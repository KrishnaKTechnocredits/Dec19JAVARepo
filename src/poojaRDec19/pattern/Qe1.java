package poojaRDec19.pattern;
/*
    * 
   * * 
  * * * 
 * * * * 
* * * * *
 
 */
public class Qe1 {

	void m2(int n) {
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
	}
	public static void main(String[] args) {
		Qe1 qe1=new Qe1();
		qe1.m2(5);
				
	}

}
