package poonamDDec19.Assignment3;
/*
 * 9) WAP to find average of user given array 
 * a. Input :- {14, 32, 19, 14, 78,36} 
 * b. Output:- 32.16 
 */
public class Q9_ArrayAvg {
	public static void arrayAvrg(int[] arr)
	{
		float sum=0.0f;
		float avg=0.0f;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			avg=sum/(arr.length);
		}
		System.out.println("Array average is: "+avg);
	}
	public static void main(String[] args) {
		int[] a = {14,32,19,14,78,36};
		arrayAvrg(a);
	}

}
