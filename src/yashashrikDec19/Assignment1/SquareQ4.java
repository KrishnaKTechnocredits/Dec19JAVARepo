package yashashrikDec19.Assignment1;
/*4) Write a program to print the sum of element’s squares of an array having size of N.
Hint:
Input: int[] array = 4 7 2 8 5
Output: 158*/

class SquareQ4
{
	void sumOfSquare(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+ (arr[i]*arr[i]);
			
		}	
		System.out.println(sum);	
	}

	public static void main(String args[])
	{
		SquareQ4 square=new SquareQ4();
		int[] num=new int[5];
		num[0]=4;
		num[1]=7;
		num[2]=2;
		num[3]=8;
		num[4]=5;
		square.sumOfSquare(num);
		
	}
}