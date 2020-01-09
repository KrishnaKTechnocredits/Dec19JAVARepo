package vishwasCDec19.vishwasAssignment2;
/*
 * Find the missing number in integer array of 1 to 10?
 */

public class Q1MissingNumber 
 {
	 
	public static void main(String[] args) {
 
		int[] arr1={7,5,6,1,4,2};
		System.out.println("Missing number from array arr1: "+missingNumber(arr1));
		int[] arr2={5,3,1,2};
		System.out.println("Missing number from array arr2: "+missingNumber(arr2));
 
	}
 
	public static int missingNumber(int[] arr)
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for (int i = 0; i < arr.length; i++) {
			restSum+=arr[i];
		}
		int missingNumber=sum-restSum;
		return missingNumber;
	}
}
