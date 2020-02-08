/*
 * e)	Generate Fibonacci series of a given range. (example 1 1 2 38…)
 */
package anjaliSDec19.Assignment4.PatternPrinting;

public class Fibbonacci {

	public static void main(String[] args) {
		int max=10;
		int a=0, b=1,c=0;
		
		for(int i=1;i<max;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
