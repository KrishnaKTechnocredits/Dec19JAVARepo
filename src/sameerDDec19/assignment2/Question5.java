package sameerDDec19.assignment2;
/*
*
*Write a java program to find second largest element in an array of integers?
*
*/
class Question5
{
	void display(int[] input)
	{
		int max=input[0];
		int secondMax=input[0];
		
		for(int i=1;i<input.length;i++)
		{
			if(input[i]>max)
			{
				secondMax=max;
				max=input[i];
			}
			else if(input[i]>secondMax)
			{
				secondMax=input[i];
			}	
		}
		System.out.println("The second largest number is "+secondMax);
	}
	public static void main(String[] args)
	{
		Question5 q5=new Question5();
		int[] num=new int[7];
		int b[]={5,8,48,45,62,65,70,10}; 	
		q5.display(b);
	}
}