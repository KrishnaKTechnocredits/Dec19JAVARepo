package rohiniBDec19.Assignment1;

/*7) You are given two numbers N and M, print the absolute difference between two numbers*/

class IntegerDiff
{
	
	void diff(int n,int m)
	{
		int sub=n-m;
		if(sub<0)
		{
			sub=sub*(-1);
			System.out.println("Need to multiply by -1 as Diff is negative  :"+sub);
		}
		else
		{
			System.out.println("Diffrence is positive no need to multiply by -1  :"+sub);
		}
		
	}
	
	public static void main(String[] args)
	{
		IntegerDiff intdiff = new IntegerDiff();
		intdiff.diff(80,30);

	}
	
	
	
}