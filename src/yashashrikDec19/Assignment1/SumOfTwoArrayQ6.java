package yashashrikDec19.Assignment1;

/*Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100. 1=N=100
Hint:
Input: int input1[] = {3, 9, 8,}
int input1[] = {8, 12, 74}
Output: 11 21 82*/


class SumOfTwoArrayQ6
{
	void displaysum(int[] arr1,int[] arr2)
	{	
		int []sum={0};
		
		try{
		for(int  i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1.length!=arr2.length)
				{
				System.out.println("Array Size mismatch");
				}
				else
				{
					sum[i]=(arr1[j]+arr2[j]);
					System.out.println(sum[i]);
				}
			}
		}
		
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}
	
	public static void main(String args[])
	{
		SumOfTwoArrayQ6 twoarray=new SumOfTwoArrayQ6();
		int[] num1=new int[3];
		num1[0]=3;
		num1[1]=9;
		num1[2]=8;
		int[] num2=new int[3];
		num2[0]=8;
		num2[1]=12;
		num2[2]=74;
		twoarray.displaysum(num1,num2);
	}
}

