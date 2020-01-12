package vishwasCDec19.vishwasAssignment2;
/*
 * WAP to print even number from the array
 */
public class Q14EvenNoArray {


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
		Q14EvenNoArray q1=new Q14EvenNoArray();
		int[] num=new int[5];
		int b1[]={15,24,52,49,62,10};
		q1.display(b1);
		
	}
	
}