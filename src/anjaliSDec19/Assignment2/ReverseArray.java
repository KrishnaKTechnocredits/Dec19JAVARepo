/*
 * WAP to reverse array
 */
package anjaliSDec19.Assignment2;

public class ReverseArray {

	void reverseArray(int[] arr)
	{
		int a=arr.length;
		System.out.print("Reverse of entered Array is :");
		for(int i=a-1;i>=0;i--)
		{
			System.out.print(arr[i] +" ");
		}
	}
	public static void main(String[] args) {
		ReverseArray rev1 = new ReverseArray();
		int[] arr = {5,6,9,10,14,63};
		rev1.reverseArray(arr);
	}
}
