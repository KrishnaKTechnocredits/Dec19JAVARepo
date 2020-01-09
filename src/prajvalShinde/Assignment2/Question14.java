package prajvalShinde.Assignment2;

public class Question14 {
	void displayEvenNo(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		Question14 input = new Question14();
		int[] arr1 = {15,24,52,49,62,10};
		input.displayEvenNo(arr1);
 	}

}
