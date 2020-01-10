package dipaPDec19.assignment2;
/*
 * Write a java program to find second largest element in an array of integers.
 */
public class Question5 {
	public static void main(String[] args) {
		int[]  arr = {2, 6, 3, 9, 11, 67, 100, 4, 34};
		secondLargestNumber(arr);
		
	}

		static void secondLargestNumber(int[] a) {
			int i = 0,j = 0,temp= 0; 				//for temporary storage 
			for(i = 0; i < a.length; i++)
			{
				for(j = i+1; j < a.length; j ++)
				{
					if(a[i] > a[j])
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp; 
					}
				}
			}
			
			System.out.println("The second largest element in an array is "+a[a.length-2]);
		}
}
