package vishwasCDec19.assign4patternprogram;
/*
 *  * * * * * 
  * * * * 
   * * * 
    * * 
     * 
 */

public class Q5 
{
	public static void main(String[] args)
		{
			int n=5;
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= i ; j++)
				{
					System.out.print(" ");
				}
				for (int k = 1; k <= n-i+1; k++)
				{
					System.out.print("* " );
				}
				
				System.out.println();
			}
		}
	}
