package prajvalShinde.Assignment2;

public class Question13 {
	void displayReverseArray(int[] a1)
	{
		for(int i=a1.length-1;i>=0;i--)
		{
			System.out.println(a1[i]);
		}
	}
	public static void main(String[] args) {
		Question13 intput = new Question13();
		int[] aa1 = {5,6,9,10,14,63,56};
		intput.displayReverseArray(aa1);
	}

}
