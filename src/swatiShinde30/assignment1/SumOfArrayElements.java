package swatiShinde30.assignment1;
/*
Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100. 1≤N≤100 
*/
class SumOfArrayElements
{
	int arraySum(int[] num1,int[] num2)
	{
		int total = 0;
		if(num1.length == num2.length)
		{
			for(int i = 0; i<num1.length;i++)
			{
				total = total+(num1[i]+num2[i]);
			}
			
		}
		else
		{
			System.out.println("Lemgth of both arrays is not same");
		}
		return total;
	}
	public static void main(String[] args)
	{
		SumOfArrayElements sum = new SumOfArrayElements();
		int[] num1 = new int[5];
		num1[0] = 1;
		num1[1] = 2;
		num1[2] = 3;
		num1[3] = 4;
		num1[4] = 5;
		
		int[] num2 = new int[5];
		num2[0] = 1;
		num2[1] = 2;
		num2[2] = 3;
		num2[3] = 4;
		num2[4] = 5;
		int total = sum.arraySum(num1,num2);
		System.out.println(total);
		
	}
}