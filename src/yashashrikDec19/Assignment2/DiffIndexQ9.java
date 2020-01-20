package yashashrikDec19.Assignment2;
/*9) Find all differ index from given arrays
i/p :- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,13}
o/p :- Values are not matching at index -> 2
 Values are not matching at index -> 4*/


public class DiffIndexQ9 {

	void displayAllIndex(int[] a1,int[] a2)
	{
		int i=0;
		for(i=0;i<a1.length;i++)
		{
			if(a1[i]!=a2[i])
				
				//flag="N";
			//num=a1[i];
				System.out.println("Values are  not matching at index "+i);
		}
		
			
	}
	public static void main(String[] args) {
		DiffIndexQ9 index=new DiffIndexQ9();
		int[] arr1= {10,2,9,14,3};
		int[] arr2= {10,2,18,14,13};
		index.displayAllIndex(arr1,arr2);
	}
}
