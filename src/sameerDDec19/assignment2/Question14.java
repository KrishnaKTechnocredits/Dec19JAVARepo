/*
 *
 * WAP to print even number from the array
 * 
 */
package sameerDDec19.assignment2;
class Question14
{
	void display(int[] input)
	{
		for(int i=0;i<input.length;i++)
		{
			if(input[i]%2==0)
			{
				System.out.println("The even numbers are "+input[i]);
			}
			else
			{
				
			}
		}
		
		
	}
	public static void main(String[] args)
	{
		Question14 q1=new Question14();
		int[] num=new int[5];
		int b1[]={15,24,52,49,62,10};
		q1.display(b1);
		
	}
	
}