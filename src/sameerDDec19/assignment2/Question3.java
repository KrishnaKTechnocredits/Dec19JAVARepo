package sameerDDec19.assignment2;
/*
*
*Check if array contains a number in Java?
*
*/
class Question3
{
	void display(int[] input,int number)
	{
		boolean flag =true;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]==number)
			{
				//System.out.println("The");
				flag=false;
			}
			
		}
		if(flag==true)
				System.out.println("The number "+number+" is not present in array");
		
	}
	public static void main(String[] args)
	{
		Question3 q3=new Question3();
		int[] num=new int[6];
		int b[]={2,5,9,7,4,6};
		int n=8;
		q3.display(b,n);
	}
}