package sameerDDec19.assignment1;
/*Write a program to print the sum of all the element of an array of size having N.
Hint:
 *   Input: int []array = {6, 3, 8,}
 * Output: 17
 */

public class Question3 
{
    void sum(int[]input)
	{
		int totalSum=0;
		for(int i=0;i<input.length;i++)
		{
			totalSum=totalSum+input[i];
			
		}
		System.out.println("Sum is "+totalSum);
	}
	
	public static void main(String[] args)
	{
		Question3 a =new Question3();
		int[] num=new int[4];
		num[0]=10;
		num[1]=13;
		num[2]=13;
		num[3]=13;
		a.sum(num);
		
	}
}


