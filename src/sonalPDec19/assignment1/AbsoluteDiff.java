package sonalPDec19.assignment1;
/*
 * You are given two numbers N and M, print the absolute difference between two numbers i.e. |N-M|
 */

class AbsoluteDiff{
	
	int calculateDiff(int x, int y)
	{
		int diff = x-y;
		if(diff<0)
		{
			diff = diff * -1;
		}
		return diff;
	}
	
	public static void main(String[] a)
	{
		AbsoluteDiff absdiff = new AbsoluteDiff();
		int absDiff = absdiff.calculateDiff(-9, 4);
		System.out.println("Absolute diffence is " +absDiff);
	}
}
