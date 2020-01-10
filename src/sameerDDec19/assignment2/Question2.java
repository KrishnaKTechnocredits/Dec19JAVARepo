package sameerDDec19.assignment2;
/*
*
*Find duplicate number on Integer array in Java
*
*/
class Question2
{
	void duplicate(int[] input)
	{
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i]==input[j])
				{	
					System.out.println("The duplicate number is "+input[i]);
				}
			}
			
		}
		
	}
	public static void main(String[] args)
	{
		Question2 q2=new Question2();
		int[] num= new int[7];
		int b[] ={1,2,3,8,3,4,5,8};
		q2.duplicate(b);
	}
	
}