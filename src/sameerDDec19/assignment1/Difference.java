/*
*
*You are given two numbers N and M, print the absolute difference between two numbers i.e. |N−M|
*
*/
class Difference
{
	public static void main(String[] args)
	{
		Difference d1=new Difference();
		d1.display(10,5);
		
	}
	void display(int n1,int n2)
	{
		int d=0;
		d=n1-n2;
		if(d<0)
		{
			d=d*(-1);
		}
		System.out.println("The difference is "+d);
	}
}