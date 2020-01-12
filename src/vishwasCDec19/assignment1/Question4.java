package vishwasCDec19.assignment1;
/*
 * Write a program to print the sum of element’s squares of an array having size of N.
 * Input: int[] array = 4 7 2 8 5
  *  Output: 158
 */

public class Question4 
{
	void sum(int[]input)
		{
			int totalSum=0;
			for(int i=0;i<input.length;i++)
			{
				int temp=0;
				temp=input[i]*input[i];
				totalSum=totalSum+temp;
				
			}
			System.out.println("Sum is "+totalSum);
		}
		public static void main(String[] args)
		{
			Question4 a =new Question4();
			int[] num=new int[5];
			num[0]=4;
			num[1]=7;
			num[2]=2;
			num[3]=8;
			num[4]=5;
			a.sum(num);
		}
	}


