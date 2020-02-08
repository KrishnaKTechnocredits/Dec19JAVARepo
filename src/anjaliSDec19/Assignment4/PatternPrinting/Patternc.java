/*
 * c)	1
3 5
7 9 11

 */
package anjaliSDec19.Assignment4.PatternPrinting;

public class Patternc {

	public static void main(String[] args) {
		int a=1, n=5;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(a+" ");
				a=a+2;
			}
			System.out.println();
		}
	}
}
