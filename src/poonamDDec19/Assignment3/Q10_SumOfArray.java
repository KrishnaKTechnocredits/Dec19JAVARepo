package poonamDDec19.Assignment3;
/*
 *  WAP to sum of two array
 *   a. firstArray :- {1, 5, 9, 3, 7} 
 *   b. secondAraay:- {1, 7,  9, 3} c. output :- 45 
 */
public class Q10_SumOfArray {
	static void twoArraySum(int[] arr1, int[] arr2)
	{
		int sum=0;
		int sum1=0;
		int total = 0 ;
		for(int i=0;i<arr1.length;i++)
			{
				sum = sum + arr1[i];
			}
		for(int j=0;j<arr2.length;j++)
			{
				sum1 = sum1 + arr2[j];
				total = sum+sum1;
			}
	
		System.out.println("Sum of given two array is: "+total);
	}
	
	public static void main(String[] args) {
		int[] a1 = {1,5,9,3,7};
		int[] a2 = {1,7,9,3};
		twoArraySum(a1, a2);
		
	}

}
