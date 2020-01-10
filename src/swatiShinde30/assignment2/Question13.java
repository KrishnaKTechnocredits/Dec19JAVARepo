package swatiShinde30.assignment2;

public class Question13 {

	static void reverseArray(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			int b = a[i];
			System.out.print(" "+b);
		}
	}
	public static void main(String[] args) {
		int[] array = { 5, 6, 7, 8 };
		reverseArray(array);

	}

}
