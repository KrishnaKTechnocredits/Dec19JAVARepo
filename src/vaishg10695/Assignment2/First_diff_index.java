/*8) Find first differ index from given arrays 
i/p :-  arr1: {10,2,9,14,3}               
		arr2: {10,2,18,14,3} 
o/p :- Values are not matching at index -> 2*/

package vaishg10695.Assignment2;

public class First_diff_index 
{
	void diffIndex(int[] a1, int[] a2)
	{
		if(a1.length!=a2.length)
			System.out.println("given two array are not equal");
		else
		{
			for(int i=0;i<a1.length;i++)
				if(a1[i]!=a2[i])
				{
					System.out.println("Values are not matching at index ->"+ i);
					return;
				}
		}
	}

	public static void main(String[] args) 
	{
		First_diff_index fdi=new First_diff_index();
		int[] arr1= {10,2,18,1,3};              
		int[] arr2= {10,2,18,14,3};
		fdi.diffIndex(arr1, arr2);
	}

}
