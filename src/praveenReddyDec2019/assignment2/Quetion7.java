package praveenReddyDec2019.assignment2;
//Find all pairs on integer array whose sum is equal to given number?
public class Quetion7 {
	static void FindPairsOfSum(int a[], int number) {

		for (int i = 0; i <a.length; i++) {
			for (int j = i + 1; j <=a.length - 1; j++) {
				if (a[i] + a[j] == number) {
					System.out.println("Pairs of integer array are  " + a[i] + "   " + a[j]);

				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 3, 5, 7, 8, 9 };
		int sum = 7;
		FindPairsOfSum(a, sum);
	}
}
