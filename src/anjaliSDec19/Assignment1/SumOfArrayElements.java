/*
 * WAP to add all the elements of an array of size 4
 */
package anjaliSDec19.Assignment1;

public class SumOfArrayElements {
	void sumOfArray(int[] arr)
	{
		int a=0;
		for (int i=0; i<4;i++)
		{
			a=a+ arr[i];
		}
		System.out.println("Sum of elements of array is : " + a);
	}
public static void main(String[] args) {
	SumOfArrayElements sm1 =new SumOfArrayElements();
	
	int[] arr = {1,5,9,6};
		sm1.sumOfArray(arr);
}
}
