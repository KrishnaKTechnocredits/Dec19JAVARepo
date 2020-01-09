package prajvalShinde.Assignment2;

public class Question11 {

	void displayUniqueNumbers(int[] a1,int[] a2)
	{
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]!=a2[i] && a2[i]!=a1[i])
				System.out.println(a1[i]);
		}
		for(int j=0;j<a1.length;j++)
		{
			if(a2[j]!=a1[j])
				System.out.println(a2[j]);
		}
	}
	public static void main(String[] args) {
		Question11 num = new Question11();
		int[] arr1 = {1,3,6,9,7};
		int[] arr2 = {2,5,6,9,8};
		num.displayUniqueNumbers(arr1, arr2);
	}
}
