package anjaliSDec19.Assignment1;

public class AbsoluteDifference {
	void absdiff(int n, int m)
	{
		int a=n-m;
		if (a<0)
			a=a*-1;
		System.out.println("Absolute difference of "+n + " and "+m+" is :"+a);
	}

	public static void main(String[] args) {
		AbsoluteDifference ad1 = new AbsoluteDifference();
		ad1.absdiff(7, 9);
	}
}
