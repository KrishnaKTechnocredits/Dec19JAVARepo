package swatiShinde30.assignment1;
/*
Write a program to print the sum of all the element of an array of size having N. 
*/
class SumOfArrayN
{
	void display(int[] d)
	{
		for(int i = 0; i<d.length; i++)
		{
			System.out.println("Array Element at "+ i + "th position is "+d[i]);
		}
		System.out.println("Array size is "+d.length);
	}
	void sum(int[] s)
	{
		int total=0;
		for(int i=0; i<s.length; i++)
		{
			total= total+s[i];
		}
		  System.out.println("Sum of an Array element is "+total);
	}
	public static void main(String[] args)
	{
		SumOfArrayN sumofarrayN = new SumOfArrayN();
		int N = 5;
		int[] num = new int[N];
		num[0]=5;
		num[1]=7;
		num[2]=5;
		num[3]=7;
		num[4]=1;
		sumofarrayN.display(num);
		sumofarrayN.sum(num);
	}
}