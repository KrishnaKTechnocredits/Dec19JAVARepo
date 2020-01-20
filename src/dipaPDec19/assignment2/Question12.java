package dipaPDec19.assignment2;
/*
 * print common number from two different array
 * a. int array1 = {1, 3, 6, 9, 7}
	b. int array2 = {2, 5, 6, 9, 8}
	output Array :- {6, 9}
 */
public class Question12 {
	public static void main(String[] args) {
		int[] array1 = {1, 3, 6, 9, 7};
		int[] array2 = {2, 5, 6, 9, 8};
		
		getCommomNumArray(array1,array2);
	}

	private static void getCommomNumArray(int[] a1, int[] a2) {
	
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a2.length; j++) 
			{
				if(a1[i] == a2[j])
					System.out.print(a1[i]+" ");
			}
		}
	}
}
