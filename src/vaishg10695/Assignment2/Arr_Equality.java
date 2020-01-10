/*6)Write a java program to check the equality of two arrays? 
Hint: Input Arrays : First Array : [21, 57, 11, 37, 24] Second Array : [21, 57, 11, 37, 24] Two Arrays Are Equal */

package vaishg10695.Assignment2;

public class Arr_Equality 
{
	void eqality(int[] a1,int[] a2)
	{
		if(a1.length!=a2.length)
			System.out.println("given two array are not equal");
		else
		{
			for(int i=0;i<a1.length;i++)
				if(a1[i]!=a2[i])
				{
					System.out.println("given two array are not equal");
					return;
				}
		System.out.println("given two array are  equal");
		}			
	}

	public static void main(String[] args)
	{
		Arr_Equality ae=new Arr_Equality();
		int[] ary1={21,57, 11, 37, 24};
		int[] ary2={21, 57, 11, 37, 24};
       ae.eqality(ary1,ary2);
       
	}

}
