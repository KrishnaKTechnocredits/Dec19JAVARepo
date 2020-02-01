/*
 //Find out missing number in interger array of 1 to 10?.
 */
package praveenReddyDec2019.assignment2;

public class MissingnumberQ1 {
	private static void FindMissingElement(int[] num) {
		int missNumber = 0;
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] < num[i + 1]) {
				if (num[i + 1] - num[i] != 1) {
					missNumber = num[i + 1] - 1;
					System.out.println(missNumber);
				}
			}
		}
	}
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		FindMissingElement(num);

	}
}
