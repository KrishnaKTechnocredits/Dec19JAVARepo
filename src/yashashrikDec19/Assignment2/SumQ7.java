package yashashrikDec19.Assignment2;
/*7) Find all pairs on integer array whose sum is equal to given number?
Hint: You have given an integer array and a number, you need to write a program to find
all elements in the array whose sum is equal to the given number. Remember, the array
may contain both positive and negative numbers, so your solution should consider that.
Input:2, 4, 3, 5, 7, 8, 9
Given sum:7
Integer numbers, whose sum is equal to value:7
(2, 5)
(4, 3)*/
public class SumQ7 {

	void sumOfGivenNum(int digit,int[] num)
	{
		int num1=0;
		int num2=0;
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(digit==(num[i]+num[j]))
				{
					
					System.out.println(num[i]+","+num[j]);
					//System.out.print(num[j]);
				}
			}
		}
		
	
	}
	public static void main(String[] args) {
	
		SumQ7 sum=new SumQ7();
		int[] array= {2,4,3,5,7,8,9};
		sum.sumOfGivenNum(9,array);
	}
}
