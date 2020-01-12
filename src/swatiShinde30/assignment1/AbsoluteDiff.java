package swatiShinde30.assignment1;
/*
You are given two numbers N and M, print the absolute difference between two numbers 
*/
class AbsoluteDiff
{
	int difference(int N,int M)
	{
		int diff = N-M;
		if(diff<0)
		{
			diff =diff*(-1);
		}
		return diff;
	}
	public static void main(String[] args)
	{
		AbsoluteDiff absolutediff = new AbsoluteDiff();
		int finalAns = absolutediff.difference(2,8);
		System.out.println("Absolute difference between given num is" +finalAns);
		
	}
}