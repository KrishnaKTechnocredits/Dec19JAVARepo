/*
 * 7.	Write programs to generate followingoutputs-
a)	A
AB
ABC

 */
package anjaliSDec19.Assignment4.PatternPrinting;

public class Patterna {

	public static void main(String[] args) {
		char[] ch = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S','T','U','V','W','X','Y','Z'};
		int n=6;
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<i;j++)
				System.out.print(ch[j]);
			System.out.println();
		}
	}
}
