package praveenReddyDec2019.assignment1;

/* 
 
 */
public class Quetion7 {
	static void twoArrays(int m, int n)
	{
		int diff;
		diff=m-n;
		if(diff>0)
		{
		  System.out.println(diff);
		}
		if(diff<0)
		{
			diff=diff*-1;
			System.out.println(m);
		}
	}	
	public static void main(String[] args)
	{
			twoArrays(1,2);
	}
}
