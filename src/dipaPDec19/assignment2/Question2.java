package dipaPDec19.assignment2;
/*
 * Find duplicate number on Integer array in Java?
 */
public class Question2 {
	static void findDuplicate(int[] a) {
		int i, j;
		for(i = 0; i < a.length; i++)
		{
			for (j = i+1 ; j < a.length; j++)
			{
				if(a[i] == a[j])
					
					System.out.println("The duplicated number is "+a[i]);
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = {0, 3, 1, 2, 3};
		findDuplicate(arr);
	}
}
