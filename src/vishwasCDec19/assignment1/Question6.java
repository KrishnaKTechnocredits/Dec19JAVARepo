package vishwasCDec19.assignment1;
/*Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100. 1≤N≤100
Hint:
Input: int input1[] = {3, 9, 8,}
int input1[] = {8, 12, 74}
Output: 11 21 82 
 */

public class Question6 {
	void sum(int[] input1,int[] input2)
	{
		
		int temp=0;

		for(int i=0;i<input1.length;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
			temp=input1[i]+input2[j];	
	
			}
			System.out.println(temp);	
		}

	}
	
	public static void main(String[] args)
	{
		Question6 a = new Question6();
		int[] num={3,9,8};
		int[] num1={8,12,74};
		a.sum(num,num1);
		
	}
}
