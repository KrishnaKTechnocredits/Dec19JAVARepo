package prajvalShinde.Assignment2;

public class Question12 {
	void displaycommonNum(int[] a1, int[] a2)
	{
		for(int i=0; i<a1.length;i++)
		{
			if(a1[i]==a2[i])
				System.out.println(+a1[i]);
		}
	}
	public static void main(String[] args) {
		Question12 num = new Question12();
		int[] arr1 = {1,3,6,9,7};
		int[] arr2 = {2,5,6,9,8};
		num.displaycommonNum(arr1, arr2);
	}

}
