/*
 * 
 * Find all differ index from given arrays
 * 
 */
package sameerDDec19.assignment2;
class Question9
{
	static void display(int[] array1,int[] array2)
	{
		for(int i=0;i<array1.length;i++)
		{
			for(int j=i;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					break;
				}
				else
				{
		
					System.out.println("The value are not matching at index "+i);
					break;
				}			
			}
			
		}
	}
	public static void main(String[] args)
	{
		int[] a1=new int[4];
		int[] b1={10,2,9,14,3};
		
		int[] a2=new int[4];
		int[] b2={10,2,18,14,13};
		
		display(b1,b2);
	}
}