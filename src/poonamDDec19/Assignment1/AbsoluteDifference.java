package poonamDDec19.Assignment1;
/*
 * print the absolute difference between two numbers
 */
public class AbsoluteDifference {
	void difference (int n, int m)
	{
		int diff = 0;
        diff = n-m;
		if(diff<0)
			{
				diff = diff*-1;
			}
			System.out.println ("The absolute between" + n + " and " + m +" is " + diff);
	}

	public static void main(String []args)
	{
	  AbsoluteDifference dif = new AbsoluteDifference();
	  dif.difference(3,7);
	}

}
