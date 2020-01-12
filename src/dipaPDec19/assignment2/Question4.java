package dipaPDec19.assignment2;
/*
 * Largest and smallest number in unsorted array?
 * Hint: For example, if input integer array is {2, 6, 3, 9, 11} and given sum is 9, output should be {6,3}.
 */
public class Question4 {
	public static void main(String[] args) {
	int[]  arr = {2, 6, 3, 9, 11};
	smallLargeNumber(arr);
	
}

	static void smallLargeNumber(int[] a) {
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
		System.out.println("The smallest number in unsorted array is "+a[0]);
		System.out.println("The largets number in unsorted array is "+a[a.length-1]);
	}
}
