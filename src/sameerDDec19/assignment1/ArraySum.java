/*
*
*Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100. 1≤N≤100
*
*/
class ArraySum
{
	public static void main(String[] args)
	{
		ArraySum a1=new ArraySum();
		int[] num1=new int[4];
		int[] num2=new int[4];
		
		num1[0]=1;
		num1[1]=5;
		num1[2]=7;
		num1[3]=9;
		
		num2[0]=1;
		num2[1]=2;
		num2[2]=3;
		num2[3]=4;
		
		a1.display(num1,num2);	
	}
	void display(int[]input1,int[]input2)
	{
		int[] sum = new int[4];
		if(input1.length==input2.length)
		{
			for(int i=0;i<input1.length;i++)
			{
				for(int j=0;j<=i;j++)
				{
					sum[i]=input1[i]+input2[j];
				}
			}
			for(int i=0;i<sum.length;i++)
			{
			System.out.println("The Sum is :"+sum[i]);
			}
		}
		else
		{
			System.out.println("Array Length is Mismatch");
		}
	}
}