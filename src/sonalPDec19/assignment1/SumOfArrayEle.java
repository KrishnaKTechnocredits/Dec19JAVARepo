package sonalPDec19.assignment1;

/*
 * Write a program to print the sum of all the elements of an array of size 4
 */

class SumOfArrayEle
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
	SumOfArrayEle sumofarrayele = new SumOfArrayEle();
	int[] num = new int[4];
		num[0] = 10;
		num[1] = 20;
		num[2] = 35;
		num[3] = 40;
	sumofarrayele.totalSum(num);
	}
}

