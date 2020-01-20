package dipaPDec19.assignment2;
/*
 * Find max value at differed index
i/p:- arr1: {10,2,9,14,3} arr2: {10,2,18,14,3}
o/p :- Values are not matching at index -> 2
		From (9,18) max value is 18
 */
public class Question10 {
	public static void main(String[] args) {
		
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,3};
		getDifferIndex(arr1,arr2);
	}

	static void getDifferIndex(int[] a1, int[] a2) {
		if(a1.length == a2.length)
		{
			int i;
			for(i = 0; i < a1.length; i++)
			{
				
				if(a1[i] < a2[i])
				{
					System.out.println("Values are not matching at index -> "+i);
					System.out.println("From ("+a1[i]+","+a2[i]+") max value is "+a2[i]);
				}
			}
			
		}
	}
}
