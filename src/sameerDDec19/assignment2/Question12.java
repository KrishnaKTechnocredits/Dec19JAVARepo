/*
 * 
 * WAP to print common number from two different array
 * 
 */

package sameerDDec19.assignment2;
class Question12
{
	void commonNumber(int[] array1,int[] array2)
	{
		for(int i=0;i<array1.length;i++)
		{
			for(int j=i;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					System.out.println("The common numbers are "+array1[i]);
				}
			}
		}
		
	}
	public static void main(String[] args)
	{
		Question12 q=new Question12();
		int[] num1=new int[4];
		int a1[]={1,3,6,9,7};
		
		int[] num2=new int[4];
		int a2[]={2,5,6,9,8};
		
		q.commonNumber(a1,a2);
	}
	
}