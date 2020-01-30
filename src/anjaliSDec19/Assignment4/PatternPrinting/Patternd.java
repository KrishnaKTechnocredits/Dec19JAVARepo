/*
 * d)	1 2 34
   5 6 7
  8  9
   10

 */
package anjaliSDec19.Assignment4.PatternPrinting;

public class Patternd {

	public static void main(String[] args) {
		int a=1, n=5;
		
		for(int i=1;i<n;i++)
		{
			for(int j=n;j>0;j--)
			{
				if(j>i)
					System.out.print((a++) + " ");
				else
					System.out.print(" ");
			}System.out.println();
		}
	}
}
