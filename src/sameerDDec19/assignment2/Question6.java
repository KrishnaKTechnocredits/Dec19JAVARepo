package sameerDDec19.assignment2;
/*
*
*Write a java program to check the equality of two arrays?
*
*/
class Question6
{
	void display(int[] array1,int[] array2)
	{		
		boolean flag=true;
		if(array1.length==array2.length)
		{
			for(int i=0;i<array1.length;i++)
			{
				if(array1[i]!=array2[i])
				{
					flag=false;
				}
			}
		}
		//else
		//{
			//flag=false;
		//}
		if(flag)
		{
			System.out.println("The array are equal");
		}
		else
		{
			System.out.println("The array are not Equal");
		}
	}
	public static void main(String[] args)
	{
		Question6 q= new Question6();
		int[] num =new int[2];
		int sam[]={1,2,3};

		int[] pqr=new int[2];
		int vish[]={1,2,3};
		q.display(sam,vish);
		
	}
}