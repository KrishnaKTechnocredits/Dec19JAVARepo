package praveenReddyDec2019.assignment2;
/*
 Find all differ index from given arrays 
 
i/p :-   arr1: {10,2,9,14,3}
         arr2: {10,2,18,14,13} 
 
o/p :-      Values are not matching at index -> 2
            Values are not matching at index -> 4 
 */

public class Firstdifferentarrayindex_Q8 {
	public static void main(String[] args) {
		int a1[] = {10,2,9,14,3};
		int a2[] = {10,2,18,14,3};
	//	Firstdifferentarrayindex_Q8 abc=new Firstdifferentarrayindex_Q8();
	//	abc.FirstIndex(a1, a2);
		Firstdifferentarrayindex_Q8.FirstIndex(a1, a2);
		
	}
	
	static void FirstIndex(int a1[], int a2[])
	{
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]!=a2[i])
			{
				System.out.println(i);
			}
		}
	}
}
