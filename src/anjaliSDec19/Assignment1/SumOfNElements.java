package anjaliSDec19.Assignment1;

public class SumOfNElements {
	void sumOfArray(int[] arr)
	{
		int a=0;
		for (int i=0; i<arr.length;i++)
		{
			a=a+ arr[i];
		}
		System.out.println("Sum of elements of array is : " + a);
	}
public static void main(String[] args) {
	SumOfNElements sm1 =new SumOfNElements();
	
	int[] arr = {6,3,8};
		sm1.sumOfArray(arr);
}
}
