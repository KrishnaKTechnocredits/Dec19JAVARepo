package yashashrikDec19.Assignment1;

/*2) Write a program to print the sum of all the elements of an array of size 4.*/

class SumOfArrayQ2
{
	void display(int[]x)
	{
		System.out.println(x.length);
		for (int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}	
	}
	
	void sum(int[]y)
	{
		int sum=0;
		for (int i=0;i<y.length;i++)
		{
			sum=sum+y[i];
			
		}
		System.out.println(sum);			
	}
	public static void main(String args[])
	{
		SumOfArrayQ2 ex1= new SumOfArrayQ2();
		int[] num=new int[4];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		ex1.display(num);
		ex1.sum(num);
		
		
	
	}
	
	
}

//Array is a group of same type of element