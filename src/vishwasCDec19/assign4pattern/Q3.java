package vishwasCDec19.assign4pattern;
/*
 * 3)	1
        3 5
        7 9 11

 */
public class Q3 
{
	static int count=1;
	public static void main(String args[])
	{
		
		for(int i=1;i<4;i++)
		{	
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(count);
				count=count+2;
			}
			System.out.println();
		}
	}

}
