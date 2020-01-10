package dipaPDec19.assignment2;
/*
 * Find all differ index from given arrays
 * i/p :- arr1: {10,2,9,14,3}	arr2: {10,2,18,14,13}
   o/p :-  Values are not matching at index -> 2
		   Values are not matching at index -> 4
 */
public class Question9 {
	public static void main(String[] args) {
		
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,13};
		getDifferIndex(arr1,arr2);
	}

	static void getDifferIndex(int[] a1, int[] a2) {
		if(a1.length == a2.length)
		{
			int i;
			for(i = 0; i < a1.length; i++)
			{
				
				if(a1[i] != a2[i])
					System.out.println("Values are not matching at index -> "+i);
			}
			
		}
	}

}
