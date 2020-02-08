/*
 * b)	1
12
123
1234
12345

 */
package anjaliSDec19.Assignment4.PatternPrinting;

public class Patternb {

	public static void main(String[] args) {
		int n=7;
		for(int i=1; i<n;i++)
		{
			for(int j=1;j<i;j++)
				System.out.print(j);
			System.out.println();
		}
	}
	
}
