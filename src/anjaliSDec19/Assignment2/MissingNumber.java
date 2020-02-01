/*
 * find missing number in integer array of 1 to 10
 */
package anjaliSDec19.Assignment2;

public class MissingNumber {

	void missingNumberInArray(int[] arr)
	{
		int sum=0;
		for (int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		int sum1 = 1+2+3+4+5+6+7+8+9+10;
		System.out.println("Missing number is :"+ (sum1-sum));
	}
	public static void main(String[] args) {
		MissingNumber mn1 = new MissingNumber();
		int[] arr= {1,2,3,4,5,6,7,8,10};
		mn1.missingNumberInArray(arr);
	}
}
