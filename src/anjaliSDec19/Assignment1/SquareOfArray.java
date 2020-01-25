/*
 * WAP to print sum of all element's square of an array of N size
 */
package anjaliSDec19.Assignment1;

public class SquareOfArray {
	
	void squareOfArray(int[] arr)
	{
		int a=0;
		for (int i=0;i<arr.length; i++)
		{
			a=a+(arr[i]*arr[i]);
		}
		System.out.println("Sum of square of all elements of array is : " + a);
	}
	
	

	public static void main(String[] args) {
		SquareOfArray s1 = new SquareOfArray();
		int[] arr = {5,8,4,7,2};
		s1.squareOfArray(arr);
		
	}
}
