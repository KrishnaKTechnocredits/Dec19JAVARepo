package poojaRDec19.pattern;
/*
 * * * * *
  * * * *
   * * *
    * *
     *
 */
public class Q5 {

	void m1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
			for(int c=1;c<=i;c++)
			{
			System.out.print(" ");
			}
		}
	}
	public static void main(String[] args) {
		Q5 q5= new Q5();
		q5.m1();
	}

}
