package yashashrikDec19.Assignment2;
/*13)WAP to reveres array
a. int inputArray = {5, 6, 9, 10, 14, 63}
b. outputArray = {63, 14, 10, 9, 6, 5}*/
public class ReverseArrayQ13 {

	void displayReverseArray(int[] a1)
	{
		for(int i=a1.length-1;i>=0;i--)
		{
			System.out.println(a1[i]);
		}
	}
	public static void main(String[] args) {
		ReverseArrayQ13 reversearray=new ReverseArrayQ13();
		int[] arr1= {5,6,9,10,14,63,56};
		reversearray.displayReverseArray(arr1);
	}
}
