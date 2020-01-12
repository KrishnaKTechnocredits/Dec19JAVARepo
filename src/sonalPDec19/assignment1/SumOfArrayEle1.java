package sonalPDec19.assignment1;

/*
 * Write a program to print the sum of all the elements of an array of size N where N can be any integer between 1 and 100. 1≤N≤100 
 */

class SumOfArrayEle1
{
	void totalSum(int[] input)
	{
		int totalSum = 0;
		for(int i = 0; i<input.length; i++)
		{
			totalSum=totalSum + input[i];
		}
		System.out.println("Sum of array elements is "+ totalSum);
	}
	
	public static void main(String[] a)
	{
	SumOfArrayEle1 sumofarrayele = new SumOfArrayEle1();
	int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 35;
		num[3] = 40;
		num[4] = 65;
	sumofarrayele.totalSum(num);
	}
}

